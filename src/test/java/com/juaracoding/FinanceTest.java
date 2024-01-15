package com.juaracoding;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FinanceTest {

    @Given("User access the link cashback sociolla")
    public void User_access_the_link_cashback_sociolla() {
        String url = "https://staging.ptkta.com/xcashback_sociolla/login\n";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("User admin has successfully logged in")
    public void User_admin_has_successfully_logged_in() {
    }

    @And("Click the finance menu button")
    public void Click_the_finance_menu_button() {
    }

    @Then("Display a list of data that has been verified")
    public void Display_a_list_of_data_that_has_been_verified() {
    }

    @And("Click table control show entries")
    public void Click_table_control_show_entries() {
    }

    @And("Select 25 lists to be displayed")
    public void Select_25_lists_to_be_displayed() {
    }

    @Then("Displays 25 data customer")
    public void Displays_25_data_customer() {
    }

    @When("Display the verification data list page")
    public void Display_the_verification_data_list_page() {
    }

    @And("Click the dashboard field in the top right corner")
    public void Click_the_dashboard_field_in_the_top_right_corner() {
    }

    @Then("The display returns to the dashboard menu")
    public void The_display_returns_to_the_dashboard_menu() {
    }

    @And("Click the edit action icon on one of the data customer")
    public void Click_the_edit_action_icon_on_one_of_the_data_customer() {
    }

    @And("Moves to the new edit data page or tab")
    public void Moves_to_the_new_edit_data_page_or_tab() {
    }

    @Then("The edit data page displays")
    public void The_edit_data_page_displays() {
    }

    @And("Scroll down")
    public void Scroll_down() {
    }

    @And("Click the table control next")
    public void Click_the_table_control_next() {
    }

    @Then("Display the data verification list on the next page")
    public void Display_the_data_verification_list_on_the_next_page() {
    }

    @And("Click the previous table control")
    public void Click_the_previous_table_control() {
    }

    @Then("Displays the verification data list on the previous page")
    public void Displays_the_verification_data_list_on_the_previous_page() {
    }

    @And("Click table control page 3")
    public void Click_table_control_page_3() {
    }

    @Then("Displays the verification data list on page 3")
    public void Displays_the_verification_data_list_on_page_3(){
    }

    @And("Enter first name in the search field")
    public void Enter_first_name_in_the_search_field(){
    }

    @And("Press enter")
    public void Press_enter(){
    }

    @Then("Displays customer data according to the first name entered")
    public void Displays_customer_data_according_to_the_first_name_entered(){
    }

    @And("Enter last name in the search field")
    public void Enter_last_name_in_the_search_field(){
    }

    @Then("Displays customer data according to the last name entered")
    public void Displays_customer_data_according_to_the_last_name_entered(){
    }

    @And("Input rrn in the search field column")
    public void Input_rrn_in_the_search_field_column(){
    }

    @Then("Displays customer data according to the ref id entered")
    public void Displays_customer_data_according_to_the_ref_id_entered(){
    }

    @And("Check list or select customer data in the check box")
    public void Check_list_or_select_customer_data_in_the_check_box(){
    }

    @And("Click the return to verifier button")
    public void Click_the_return_to_verifier_button(){
    }

    @And("A confirmation pop up appears")
    public void A_confirmation_pop_up_appears(){
    }

    @And("Click the save button")
    public void Click_the_save_button(){
    }

    @Then("Displays a message success updated successfully")
    public void Displays_a_message_success_updated_successfully(){
    }

    @And("Click update transferred")
    public void Click_update_transferred(){
    }

    @And("Click the top check box field")
    public void Click_the_top_check_box_field(){
    }

    @Then("All customer data on the page accessed is checked in the list")
    public void All_customer_data_on_the_page_accessed_is_checked_in_the_list(){
    }

    @When("Click the finance menu button")
    public void Click_the_finance_menu_button(){
    }

    @Then("Displays a message please check data")
    public void Displays_a_message_please_check_data(){
    }

    @And("Check list of 10 customer data")
    public void Check_list_of_10_customer_data(){
    }



}

