package com.selenium.ui.pageobjects.Admin;
import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import static com.selenium.ui.pageobjects.Register.RegisterPageTravelers.FirstName;
import static com.selenium.ui.pageobjects.Register.RegisterPageTravelers.LastName;

public class AdminPayments extends BasePage {

    public AdminPayments() {
        super();
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    By Diagnostics = By.xpath("//*[@id='liLabOrder']");
    By Visits = By.xpath("//*[@id='liBillingSubmission']");
    By LabOrderBTN = By.xpath("//*[@id='divMain']/div/div[2]/div/div/button");
    By Member = By.xpath("//*[@id='MemberName']");
    By MemberS = By.xpath("//*[@id='MemberName_listbox']/li[1]");
    By SaveBTN = By.xpath("//*[@id='divMain']/div[6]/div/button");
    By Scroll = By.xpath("/html");
    By CollectionDate = By.xpath("//*[@id='divMain']/div[3]/div[3]/span/span/span/span");
    By SelectCollectionDate = By.xpath("//*[@id='SampleDate']");
    By SelectedDate = By.xpath("//*[@id='SampleDate']");
    By Invoicing = By.xpath("//*[@id='divMain']/div[11]/button[1]");
    By FilterOp = By.xpath("//*[@id='grid']/div[1]/div/table/thead/tr/th[2]/a[1]/span");
    By Content = By.xpath("/html/body/div[15]/form/div[1]/input");
    By FilterBTN = By.xpath("/html/body/div[15]/form/div[1]/div[2]/button[1]");
    By EditIcon = By.xpath("//*[@id='grid']/div[2]/table/tbody/tr/td[1]/a/span");
    By FilterOption = By.xpath("//*[@id='gvOrganizationGrid']/div[2]/div/table/thead/tr/th[2]/a[1]/span");
    By Contains = By.xpath("/html/body/div[15]/form/div[1]/input");
    By EyeIconBTN = By.xpath("//*[@id='gvOrganizationGrid']/div[3]/table/tbody/tr[1]/td[1]/a/span");
    By ActivateBTN = By.xpath("//*[@id='divMainAddPlans']/div[1]/div[2]/a");
    By CardCharge = By.xpath("//*[@id='liChargeCard']");
    By FilterMember = By.xpath("//*[@id='MemberGrid']/div[1]/div/table/thead/tr/th[2]/a[1]/span");
    By FilterButton = By.xpath("//button[normalize-space()='Filter']");
    By MemberName = By.xpath("/html/body/div[21]/form/div[1]/input");
    By FacilityName = By.xpath("//*[@id='OrganizationNames']");
    By Amount = By.xpath("//*[@id='AmountPaid']");
    By SavePaymentBTN = By.xpath("//*[@id='btnSavePayment']");
    By YesBTN = By.xpath("//*[@id='btnYes']");
    By BTNYes = By.xpath("(//button[@id='btnYes'])[2]");
    By PopupMessage = By.xpath("//*[@id='spnPopupMessage']");
    By SuccessBTN = By.xpath("//*[@id='btnSuccess']");
    By AddNewCart= By.xpath("//input[@value='0']");
    By CardNumber= By.xpath("//*[@id='CardNumber']");
    By NameOnCard= By.xpath("//*[@id='NameOnCard']");
    By ExpireYear= By.xpath("//*[@id='divbankdetails']/div[2]/div[1]/span[3]/span/span[1]");
    By SelectExpireYear= By.xpath("//*[@id='YY_listbox']/li[6]");
    By EnterCVV= By.xpath("//*[@id='CVV']");
    By FacilityNM = By.xpath("//*[@id='OrganizationNames']");
    By statusDropdown = By.xpath("//span[@aria-owns='ClaimStatus_listbox']");
    By statusOptions = By.xpath("//ul[@id='ClaimStatus_listbox']/li");
    By searchButton = By.xpath("//button[contains(text(),'Search')]");
    By tableRows = By.xpath("//table[contains(@class,'k-grid-table')]//tr");
    By tableRow = By.xpath("//table[@id='visitsTable']//tr");
    By glyphicon = By.xpath("//*[@id='gridClaims']/div[3]/table/tbody/tr[1]/td[1]/a/span");
    By MakeChangeBTN = By.xpath("//*[@id='btnEditVisit']");
    By SelectCalendar  = By.xpath("//*[@id='editVisitForm']/div[1]/div[1]/span/span/span/span");
    By ServiceDate = By.xpath("//*[@id='editDateOfService']");
    By EditServiceDate = By.xpath("//*[@id='btnSubmitEditVisit']");
    By VoidInvoicing = By.xpath("//*[@id='divMain']/div[11]/button[2]");


    public void DiagnosticsWithAdmin() throws InterruptedException {
        click(Diagnostics, "Select member Plan");
        Thread.sleep(1000);
        click(LabOrderBTN, "");
        Thread.sleep(10000);
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        enterValue(Member,FirstName,"");
        Thread.sleep(1000);
        click(MemberS,"");
        Thread.sleep(1000);
        click(SaveBTN,"");
        Thread.sleep(1000);
        scrollDowns(Scroll,300);
        click(CollectionDate,"");
        enterValue(SelectCollectionDate, Keys.ENTER);
        Thread.sleep(1000);
        enterValue(SelectedDate, Keys.ENTER);
        click(Invoicing,"");
    }

    public void CheckValidation_DiagnosticsWithAdmin() throws InterruptedException {
        click(Diagnostics, "Select member Plan");
        Thread.sleep(1000);
        click(LabOrderBTN, "");
        Thread.sleep(10000);
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        enterValue(Member, FirstName, "");
        Thread.sleep(1000);
        click(MemberS, "");
        Thread.sleep(1000);
        click(SaveBTN, "");
        Thread.sleep(10000);
        click(Diagnostics, "Select member Plan");
        Thread.sleep(10000);
        click(FilterOp,"");
        enterValue(Content,FirstName+" "+LastName," ");
        click(FilterBTN,"");
        Thread.sleep(10000);
        click(EditIcon,"");
        click(CollectionDate,"");
        enterValue(SelectCollectionDate,Keys.ENTER);
        Thread.sleep(1000);
        enterValue(SelectedDate, Keys.ENTER);
        click(Invoicing,"");
    }
    public void CheckValidation_CollectionDateDiagnosticsWithAdmin() throws InterruptedException {
        click(Diagnostics, "Select member Plan");
        Thread.sleep(1000);
        click(LabOrderBTN, "");
        Thread.sleep(10000);
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        enterValue(Member, FirstName, "");
        Thread.sleep(1000);
        click(MemberS, "");
        Thread.sleep(1000);
        click(SaveBTN, "");
        Thread.sleep(10000);
        click(Diagnostics, "Select member Plan");
        Thread.sleep(10000);
        click(FilterOp,"");
        enterValue(Content,FirstName+" "+LastName," ");
        click(FilterBTN,"");
        Thread.sleep(10000);
        click(EditIcon,"");
        Thread.sleep(1000);
        click(Invoicing,"");
    }

    public void SearchFacilityForActivation() throws InterruptedException {
        Thread.sleep(10000);
        click(FilterOption,"");
        enterValue(Contains,FirstName,"");
        click(FilterBTN,"");
        click(EyeIconBTN,"");
        Thread.sleep(1000);
        click(ActivateBTN,"");
        Thread.sleep(1000);
        click(CardCharge,"");
        switchToNewWindow();
        Thread.sleep(10000);
        click(FilterMember,"");
        enterValue(MemberName,"TestName", "");
        click(FilterButton,"");
        Thread.sleep(10000);
        selectRandomMemberAndClickChangeCard();
        enterValue(FacilityName,FirstName,"");
        enterValue(Amount,"1000","");
    }
    public void SaveAndFinalization() throws InterruptedException {
        click(SavePaymentBTN, "");
        click(YesBTN, "");
        click(SuccessBTN, "");
    }
    public void LabOrder_VoidInvoicing() throws InterruptedException {
        click(Diagnostics, "Select member Plan");
        Thread.sleep(1000);
        List<WebElement> PencilIcons = driver.findElements( By.xpath("//span[@class='glyphicon glyphicon-pencil']") );
        System.out.println("Total Eye Icons Found: " + PencilIcons.size());
        if (PencilIcons.isEmpty())
        {Thread.sleep(10000);
            throw new RuntimeException("No eye icons found on the page!");
        }
        Random rand = new Random();
        int randomIndex = rand.nextInt(PencilIcons.size());
        WebElement selectedPencil = PencilIcons.get(randomIndex);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectedPencil);
        selectedPencil.click();
        click(VoidInvoicing,"");
        Thread.sleep(1000);
        click(BTNYes,"");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"spnLabPopupMessage\"]")));
        String popupText = popup.getText().trim();
        System.out.println("Popup text: " + popup.getText());
        Assert.assertTrue(popupText.contains("LabOrder Saved."), "Wrong PDF file opened!");
        click(YesBTN,"");
        Thread.sleep(10000);


    }
    public void SearchVisitsForFacilityWithStatus() throws InterruptedException {
        click(Visits, "");
        enterValue(FacilityNM, "SR Medical Center", "");
        wait.until(ExpectedConditions.elementToBeClickable(statusDropdown));
        click(statusDropdown, "");
        Thread.sleep(2000);

        List<WebElement> allStatusOptions = driver.findElements(statusOptions);
        for (int i = 1; i < allStatusOptions.size(); i++) {
            try {
                click(statusDropdown, "");
                Thread.sleep(1000);

                List<WebElement> refreshedOptions = driver.findElements(statusOptions);
                if (i >= refreshedOptions.size()) break;

                WebElement option = refreshedOptions.get(i);
                String statusName = option.getText().trim();

                if (statusName.isEmpty()) continue;
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);

                System.out.println("Selected Status: " + statusName);
                driver.findElement(searchButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(tableRows));

                List<WebElement> rows = driver.findElements(tableRows);
                if (rows.size() > 1) {
                    System.out.println("Data found for Status: " + statusName);
                } else {
                    System.out.println("No data found for Status: " + statusName);
                }
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Error selecting status " + i + ": " + e.getMessage());
            }
        }
    }

    public void MakeChangesToVisitsWithStatus() throws InterruptedException {
        click(Visits, "");
        enterValue(FacilityNM, "SR Medical Center", "");
        Thread.sleep(1000);
        driver.findElement(statusDropdown).click();
        Thread.sleep(1000);
        List<WebElement> allStatusOptions = driver.findElements(statusOptions);
        for (WebElement option : allStatusOptions) {
            if (option.getText().trim().equalsIgnoreCase("Draft")) {
                option.click();
                System.out.println("Selected Status: Draft");
                break;
            }
        }
        driver.findElement(searchButton).click();
        Thread.sleep(3000); // wait for results to load
        click(glyphicon,"");
        click(MakeChangeBTN,"");
        click(SelectCalendar,"");
        enterValue(ServiceDate, Keys.ARROW_DOWN);
        enterValue(ServiceDate, Keys.ENTER);
        click(EditServiceDate,"");
    }

    public void AddedNewCardDetails() throws InterruptedException {
        click(AddNewCart, "");

        String[] testCards = {
                "4242424242424242", "4000056655665556", "4012888888881881", "4111111111111111",
                "4000002500003155", "4000003560000008", "5555555555554444", "5105105105105100",
                "5200828282828210", "2223003122003222", "5200000000000015", "378282246310005",
                "371449635398431", "378734493671000", "6011111111111117", "6011000990139424",
                "6011000000000012", "30569309025904", "38520000023237", "3566002020360505",
                "3530111333300000", "4000000000009995", "4000003920000008", "4000004840008001",
                "4000008260000000", "4000008400000009", "4000009180000003"
        };
        for (String card : testCards) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.elementToBeClickable(CardNumber));

                WebElement cardField = driver.findElement(CardNumber);
                cardField.click();
                cardField.clear();
                Thread.sleep(500);
                enterValue(CardNumber, card, "");
                enterValue(NameOnCard, CreatedDummyName(), "");
                click(ExpireYear, "");
                click(SelectExpireYear, "");
                enterValue(EnterCVV, "123", "");
                click(SavePaymentBTN, "");
                click(YesBTN, "");
                Thread.sleep(2000);
                List<WebElement> errorMsg = driver.findElements(By.xpath("//*[contains(text(),'Card already exists')]"));
                if (!errorMsg.isEmpty() && errorMsg.get(0).isDisplayed()) {
                    System.out.println("Duplicate card detected: " + card + " — trying next card...");
                    Thread.sleep(1000);
                    continue;
                }
                System.out.println("Card added successfully with number: " + card);
                Thread.sleep(1000);
                click(SuccessBTN, "");
                break;
            } catch (Exception e) {
                System.out.println("Issue with card: " + card + " — " + e.getMessage());
                Thread.sleep(1000);
            }
        }
    }




    public void selectRandomMemberAndClickChangeCard() throws InterruptedException {
        // Locate all rows of the table (excluding the header)
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

        if (rows.isEmpty()) {
            System.out.println("No members found in the table!");
            return;
        }

        // Generate a random index
        Random rand = new Random();
        int randomIndex = rand.nextInt(rows.size());

        // Locate that specific row
        WebElement randomRow = rows.get(randomIndex);

        // Get member name for logging
        String memberName = randomRow.findElement(By.xpath("./td[2]")).getText();
        System.out.println("Selected random member: " + memberName);

        // Click "Charge Card" link **inside that same row**
        WebElement changeCardLink = randomRow.findElement(By.xpath(".//a[contains(text(),'Charge Card')]"));
        changeCardLink.click();

        Thread.sleep(2000);
    }
    public void switchToNewWindow() {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }


}