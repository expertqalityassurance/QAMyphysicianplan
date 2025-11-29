package com.selenium.dataprovider;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/main/resources/envconfig.properties"})
public interface PropReader extends Config {

    @DefaultValue("staging")
    String environment();
    @Key("${environment}.username")
    String username();
    @Key("${environment}.password")
    String password();
    @Key("${environment}.url")
    String url();
    @Key("${environment}.Admin_Username")
    String Admin_Username();
    @Key("${environment}.Admin_password")
    String Admin_password();
    @Key("${environment}.Doctors_url")
    String Doctors_url();
    @Key("${environment}.Agent_url")
    String Agent_url();
    @Key("${environment}.Agent_User")
    String Agent_User();
    @Key("${environment}.Agent_password")
    String Agent_password();



}