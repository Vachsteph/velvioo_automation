package com.velvioo;

import config.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tests extends TestBase{

    @Test
    public void LiveMap(){

         driver.findElement(By.linkText("Live map")).click();

       waitForFinding();

      String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/live");
    }

    @Test
    public void Fleet(){

        driver.findElement(By.linkText("Fleet")).click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/fleets");
    }

    @Test
    public void Users(){

        driver.findElement(By.linkText("Users")).click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/users");
    }

    @Test
    public void Stations(){

        driver.findElement(By.linkText("Stations")).click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/stations");
    }

    @Test
    public void Vehicles(){

        driver.findElement(By.linkText("Vehicles")).click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/vehicles");
    }

    @Test
    public void Rates(){

        driver.findElement(By.linkText("Price management")).click();
        driver.findElement(By.linkText("Rates")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/priceManagement/rates");
    }

    @Test
    public void Balance(){

        driver.findElement(By.linkText("Price management")).click();
        driver.findElement(By.linkText("Balance")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/priceManagement/balance");
    }

    @Test
    public void Plans(){

        driver.findElement(By.linkText("Price management")).click();
        driver.findElement(By.linkText("Plans")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/priceManagement/plans");
    }

    @Test
    public void Programs(){

        driver.findElement(By.linkText("Price management")).click();
        driver.findElement(By.linkText("Programs")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/priceManagement/programs");
    }

    @Test
    public void Renew(){

        driver.findElement(By.linkText("Price management")).click();
        driver.findElement(By.linkText("Renew")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/priceManagement/renew");
    }

    @Test
    public void Coupons(){

        driver.findElement(By.linkText("Price management")).click();
        driver.findElement(By.linkText("Coupons")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/priceManagement/coupons");
    }

    @Test
    public void OperationsVehicles(){
        driver.findElement(By.linkText("Operations Module")).click();

        driver.findElements(By.linkText("Vehicles")).get(1).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='card-header ']")));

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/operations/vehicles");
    }

    @Test
    public void OperationsSuggestions(){

        driver.findElement(By.linkText("Operations Module")).click();
        driver.findElement(By.linkText("Suggestions")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/operations/operations");
    }

    @Test
    public void OperationsTeams(){

        driver.findElement(By.linkText("Operations Module")).click();
        driver.findElement(By.linkText("Teams")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/operations/teams");
    }

    @Test
    public void ReportProblems(){

        driver.findElement(By.linkText("Report problem")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/reportProblem");
    }

    @Test
    public void Reservation(){

        driver.findElement(By.linkText("Reservation")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/reservation");
    }

    @Test
    public void Rentals(){

        driver.findElement(By.linkText("Rentals")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/rentals");
    }

    @Test
    public void Zones(){

        driver.findElement(By.linkText("Zones")).click();
        waitForFinding();

        Assert.assertEquals(driver.getCurrentUrl(),Configuration.ADMIN_URL +"/zones");
    }

    @Test
    public void Tutorials(){

        WebElement tutorials = driver.findElement(By.linkText("Tutorials"));
        scrollPage(tutorials);

        tutorials.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/tutorials");
    }

    @Test
    public void Payments(){

        WebElement payments = driver.findElement(By.linkText("Payments"));

        scrollPage(payments);
        payments.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/payments");
    }

    @Test
    public void Payout(){

        WebElement payouts = driver.findElement(By.linkText("Payouts"));
        scrollPage(payouts);

        payouts.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/payouts");
    }

    @Test
    public void BalancePayments(){

        WebElement balancePayments = driver.findElement(By.linkText("Balance Payments"));
        scrollPage(balancePayments);

        balancePayments.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url, Configuration.ADMIN_URL + "/balance-payments");
    }

    @Test
    public void Agents(){

        WebElement agents = driver.findElement(By.linkText("Agents"));

        scrollPage(agents);
        agents.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/agents");
    }

    @Test
    public void DeploymentDevices(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement devices = driver.findElement(By.linkText("Devices"));
        devices.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/lockers");
    }

    @Test
    public void DeploymentLockersLog(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement lockerLogs = driver.findElement(By.linkText("Locker logs"));
        lockerLogs.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/lockers-log");
    }

    @Test
    public void DeploymentActionLogs(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement actionLogs = driver.findElement(By.linkText("Action logs"));
        scrollPage(actionLogs);
        actionLogs.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/logs");
    }

    @Test
    public void DeploymentJobs(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement jobs = driver.findElement(By.linkText("Jobs"));
        scrollPage(jobs);
        jobs.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/jobs");
    }

    @Test
    public void DeploymentLocalization(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement localization = driver.findElement(By.linkText("Localization"));
        scrollPage(localization);
        localization.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/localizations");
    }

    @Test
    public void DeploymentRPLocalization(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement rpLocalization = driver.findElement(By.linkText("RP Localization"));
        scrollPage(rpLocalization);
        rpLocalization.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/RPlocalizations");
    }

    @Test
    public void DeploymentBlackList(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement blackList = driver.findElement(By.linkText("Black List"));
        scrollPage(blackList);
        blackList.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/black-list");
    }

    @Test
    public void DeploymentApplications(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement applications = driver.findElement(By.linkText("Applications"));
        scrollPage(applications);
        applications.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/applications");
    }

    @Test
    public void DeploymentCurrencies(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement currencies = driver.findElement(By.linkText("Currencies"));
        scrollPage(currencies);
        currencies.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/currencies");
    }

    @Test
    public void DeploymentSMSLog(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement smsLog = driver.findElement(By.linkText("Sms Log"));
        scrollPage(smsLog);
        smsLog.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/sms-log");
    }

    @Test
    public void DeploymentVerificationLog(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement smsVerificationsLog = driver.findElement(By.linkText("SMS Verifications log"));
        scrollPage(smsVerificationsLog);
        smsVerificationsLog.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/verifications-log");
    }

    @Test
    public void DeploymentPaymentDebug(){

        WebElement deployment = driver.findElement(By.linkText("Deployment"));
        scrollPage(deployment);
        deployment.click();
        WebElement paymentDebug = driver.findElement(By.linkText("Payment debug"));
        scrollPage(paymentDebug);
        paymentDebug.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/deployment/payment-log");
    }

    @Test
    public void ReportsModuleReports(){

        WebElement reportsModule = driver.findElement(By.linkText("Reports Module"));
        scrollPage(reportsModule);
        reportsModule.click();
        WebElement reports = driver.findElement(By.linkText("Reports"));
        scrollPage(reports);
        reports.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/reports/reports");
    }

    @Test
    public void ReportsModuleReveniue(){

        WebElement reportsModule = driver.findElement(By.linkText("Reports Module"));
        scrollPage(reportsModule);
        reportsModule.click();
        WebElement revenue = driver.findElement(By.linkText("Revenue"));
        scrollPage(revenue);
        revenue.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/reports/revenue");
    }
}




