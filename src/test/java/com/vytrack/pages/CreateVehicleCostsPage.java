package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CreateVehicleCostsPage extends BasePage{

    @FindBy(xpath = "//div[normalize-space()='Create Vehicle Costs']")
    public WebElement createVehicleCostsElement;

    @FindBy(xpath = "//div[@class=\"controls\"]//div[1]//a//span[@class='select2-chosen']")
    public WebElement chooseAValueElement;

    @FindBy(className = "select2-result-label")
    public List<WebElement> ValueTypes;

    @FindBy(name = "custom_entity_type[TotalPrice]")
    public WebElement totalPrice;

    @FindBy(xpath = "//input[@placeholder='Choose a date']")
    public WebElement dateElement;

    @FindBy(xpath = "//button[@data-handler=\"today\"]")
    public WebElement todayElement;

    @FindBy(className = "ui-datepicker-month")
    public List<WebElement> monthElement;

    @FindBy(xpath = "//td[@data-handler='selectDay']")
    public List<WebElement> dayElement;

    @FindBy(className = "ui-datepicker-year")
    public static List<WebElement> yearElement;

    @FindBy(name = "custom_entity_type[CostDescriptions]")
    public WebElement costDescriptionElement;

    @FindBy(xpath = "//div[@class=\"btn-group pull-right\"]")
    public WebElement saveAndCloseElement;


    /**
     * this method takes the type of cost
     * and selects the type of cost by type
     * For example if the type is 'Road Assistance' , it will select it.
     * @param type
     * @return
     */
    public WebElement selectType(String type){
        String locator = "//div[@class='select2-result-label' and text()='" + type + "']";

        WebElement typeOfCost = Driver.get().findElement(By.xpath(locator));
        BrowserUtils.waitForVisibility(typeOfCost, 15);
        BrowserUtils.waitForClickablility(typeOfCost, 15);

        typeOfCost.click();
        return typeOfCost;
    }

    public void clickToCreateVehicleCosts(){
        BrowserUtils.waitForVisibility(createVehicleCostsElement,15);
        BrowserUtils.waitForClickablility(createVehicleCostsElement,15);
        createVehicleCostsElement.click();
    }

    public void selectDate(int day, String month, String year){

        dateElement.click();
        BrowserUtils.waitForVisibility(dayElement.get(day),10);
        BrowserUtils.waitForClickablility(dayElement.get(day),10);
        dayElement.get(day).click();


    }

}
