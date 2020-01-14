package com.vytrack.step_definitions;

import com.vytrack.pages.CreateVehicleCostsPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import java.util.List;
import java.util.Map;

public class CreateVehicleCostsStepDefinitions {
    LoginPage loginPage = new LoginPage();

    CreateVehicleCostsPage createVehicleCostsPage = new CreateVehicleCostsPage();

    @Then("user adds new vehicle costs information:")
    public void user_adds_new_vehicle_costs_information(List<Map<String, String>> dataTable) {
        //loginPage.login("storemanager85","UserUser123");

        createVehicleCostsPage.waitUntilLoaderMaskDisappear();

        createVehicleCostsPage.clickToCreateVehicleCosts();
        BrowserUtils.waitForVisibility(createVehicleCostsPage.chooseAValueElement,10);
        createVehicleCostsPage.chooseAValueElement.click();
        createVehicleCostsPage.selectType(dataTable.get(0).get("Type"));

        createVehicleCostsPage.totalPrice.sendKeys(dataTable.get(0).get("Price"));
        createVehicleCostsPage.dateElement.click();
        createVehicleCostsPage.todayElement.click();
        createVehicleCostsPage.costDescriptionElement.sendKeys(dataTable.get(0).get("Description"));
        createVehicleCostsPage.saveAndCloseElement.click();
    }
}
