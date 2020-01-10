package com.vytrack.step_definitions;

import com.vytrack.pages.CreateVehicleCostsPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import java.util.List;
import java.util.Map;

public class CreateVehicleCostsStepDefinitions {

    CreateVehicleCostsPage createVehicleCostsPage = new CreateVehicleCostsPage();

    @Then("user adds new vehicle costs information:")
    public void user_adds_new_vehicle_costs_information(List<Map<String, String>> dataTable) {

        createVehicleCostsPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.wait(2);
        createVehicleCostsPage.clickToCreateVehicleCosts();
        BrowserUtils.wait(2);
        createVehicleCostsPage.typeOfCosts("Type");
        BrowserUtils.wait(2);
        createVehicleCostsPage.setTotalPrice("Price");
        BrowserUtils.wait(2);
        createVehicleCostsPage.chooseDate("Date");
        BrowserUtils.wait(2);
        createVehicleCostsPage.costDescription("Description");
        BrowserUtils.wait(2);
        createVehicleCostsPage.clickSaveAndNew();
        BrowserUtils.wait(1);
    }
}
