package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CreateVehicleCostsPage extends BasePage{

    @FindBy(xpath = "//div[@class=\"pull-right title-buttons-container\"]")
    public WebElement createVehicleCostsElement;

    @FindBy(xpath = "//ul[@class=\"select2-results\"]//li")
    public List<WebElement> TypesList;

    @FindBy(xpath = "//div[@class=\"controls\"]//input[@name=\"custom_entity_type[TotalPrice]\"]")
    public WebElement totalPriceElement;

    @FindBy(id = "//input[@placeholder=\"Choose a date\"]")
    public WebElement chooseADateElement;

    @FindBy(name = "//div[@class=\"controls\"]//textarea")
    public WebElement descriptionElement;

    @FindBy(className = "btn-success btn dropdown-toggle")
    public WebElement saveToggle;

    @FindBy(xpath = "//button[@class=\"btn btn-success action-button\"]")
    public WebElement saveAndCloseElement;

    @FindBy(xpath = "//ul[@class=\"dropdown-menu\"]//li[2]//button")
    public WebElement saveAndNewElement;

    @FindBy(xpath = "//ul[@class=\"dropdown-menu\"]//li[3]//button")
    public WebElement save;


    // this will look if createVehicleCosts Element is visible and clickable, then will click
    public void clickToCreateVehicleCosts(){
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForVisibility(createVehicleCostsElement,5);
        BrowserUtils.waitForClickablility(createVehicleCostsElement,5);
        createVehicleCostsElement.click();
    }

    // we will choose the type of cost in this method.
    public void typeOfCosts(String typeOfCost){
      //  TypesList.get(TypesList.indexOf(typeOfCost));
        for(WebElement type : TypesList){
            if(type.equals(typeOfCost)){
                type.click();
            }
        }
    }

    public void setTotalPrice(String totalPrice){
        totalPriceElement.sendKeys(totalPrice);
    }

    public void chooseDate(String date){
        BrowserUtils.waitForVisibility(chooseADateElement,5);
        chooseADateElement.click();
        chooseADateElement.sendKeys(date, Keys.ENTER);

    }

    public void costDescription(String description){
        descriptionElement.sendKeys(description);
    }

    public void clickSaveAndNew(){
        BrowserUtils.waitForVisibility(saveAndNewElement,5);
        BrowserUtils.waitForClickablility(saveAndNewElement,5);
        saveAndNewElement.click();
    }

}
