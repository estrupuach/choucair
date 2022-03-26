package co.com.user.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormDevices extends PageObject {
    public static final Target OPEN_LIST_COMPUTER = Target.the("Open the list of computers").located(By.name("osId"));//"//div[@name="osId']"
    public static final Target SELECT_COMPUTER = Target.the("Select the computer device").locatedBy("//div[text()='Windows']");
    public static final Target OPEN_LIST_VERSION = Target.the("Open the list of versions").located(By.name("osVersionId"));
    public static final Target SELECT_VERSION = Target.the("Select the computer device").locatedBy("//span[text()='10']");
    public static final Target OPEN_LIST_LANGUAGE = Target.the("Open the list of language").located(By.name("osLanguageId"));
    public static final Target SELECT_LANGUAGE = Target.the("Select the language").locatedBy("//span[text()='English']");
    public static final Target OPEN_LIST_DEVICE = Target.the("Open the list of mobile devices").located(By.name("handsetMakerId"));

    public static final Target SELECT_DEVICE = Target.the("Select the mobile device").locatedBy("//div[text()='Apple']']");
    public static final Target OPEN_LIST_MODEL = Target.the("Open the list of model").located(By.name("handsetModelId"));
    public static final Target SELECT_MODEL = Target.the("Select the model").locatedBy("(//input[@type='search'])[5]");
    public static final Target OPEN_LIST_OPERATING_SYSTEM = Target.the("Open the list of Operating System").located(By.name("handsetOSId"));
    public static final Target SELECT_OPERATING_SYSTEM = Target.the("Select the model").locatedBy("(//input[@type='search'])[6]");
    public static final Target BUTTON_NEXT = Target.the("Button that continue the next page").locatedBy("//a[@href='#']");
    public static final Target WRITE_VERSION = Target.the("write for writer the version computer").locatedBy("(//input[@type='search'])[2]");
    public static final Target INPUT_VERSION = Target.the("XXXX").locatedBy("(//span[text()='Windows 10 Pro']");
    public static final Target WRITE_MOBILE = Target.the("write the mobile device").locatedBy("(//input[@type='search'])[4]");
    public static final Target WRITE_MODEL = Target.the("write the mobile device model").locatedBy("(//input[@type='search'])[5]");
    public static final Target WRITE_OPERATING_SYSTEM = Target.the("write the operating system").locatedBy("(//input[@type='search'])[6]");
}
