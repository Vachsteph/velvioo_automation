package com.velvioo;

import config.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends TestBase{

    @Test
    public void LiveMap(){

        WebElement liveMap = driver.findElement(By.linkText("Live map"));
                liveMap.click();

       waitForFinding();

      String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/live");
    }

    @Test
    public void Fleet(){

        WebElement fleet = driver.findElement(By.linkText("Fleet"));
        fleet.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/fleets");
    }

    @Test
    public void Users(){

        WebElement users = driver.findElement(By.linkText("Users"));
        users.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/users");
    }

    @Test
    public void Stations(){

        WebElement stations = driver.findElement(By.linkText("Stations"));
        stations.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/stations");
    }

    @Test
    public void Vehicles(){

        WebElement vehicles = driver.findElement(By.linkText("Vehicles"));
        vehicles.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/vehicles");
    }

    @Test
    public void Rates(){

        WebElement priceManagement = driver.findElement(By.linkText("Price management"));
        priceManagement.click();
        WebElement rates = driver.findElement(By.linkText("Rates"));
        rates.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/priceManagement/rates");
    }

    @Test
    public void Balance(){

        WebElement priceManagement = driver.findElement(By.linkText("Price management"));
        priceManagement.click();
        WebElement balance = driver.findElement(By.linkText("Balance"));
        balance.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/priceManagement/balance");
    }

    @Test
    public void Plans(){

        WebElement priceManagement = driver.findElement(By.linkText("Price management"));
        priceManagement.click();
        WebElement plans = driver.findElement(By.linkText("Plans"));
        plans.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/priceManagement/plans");
    }

    @Test
    public void Programs(){

        WebElement priceManagement = driver.findElement(By.linkText("Price management"));
        priceManagement.click();
        WebElement programs = driver.findElement(By.linkText("Programs"));
        programs.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/priceManagement/programs");
    }

    @Test
    public void Renew(){

        WebElement priceManagement = driver.findElement(By.linkText("Price management"));
        priceManagement.click();
        WebElement renew = driver.findElement(By.linkText("Renew"));
        renew.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/priceManagement/renew");
    }

    @Test
    public void Coupons(){

        WebElement priceManagement = driver.findElement(By.linkText("Price management"));
        priceManagement.click();
        WebElement coupons = driver.findElement(By.linkText("Coupons"));
        coupons.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/priceManagement/coupons");
    }

    @Test
    public void OperationsVehicles(){

        WebElement priceManagement = driver.findElement(By.linkText("Operations Module"));
        priceManagement.click();
        WebElement vehicles = driver.findElement(By.cssSelector(".ng-star-inserted.ng-tns-c5-0.pcoded-hasmenu.pcoded-trigger > .pcoded-submenu > li:nth-of-type(1) > .ng-tns-c5-0"));
        vehicles.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/operations/vehicles");
    }

    @Test
    public void OperationsSuggestions(){

        WebElement priceManagement = driver.findElement(By.linkText("Operations Module"));
        priceManagement.click();
        WebElement suggestions = driver.findElement(By.linkText("Suggestions"));
        suggestions.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/operations/operations");
    }

    @Test
    public void OperationsTeams(){

        WebElement priceManagement = driver.findElement(By.linkText("Operations Module"));
        priceManagement.click();
        WebElement teams = driver.findElement(By.linkText("Teams"));
        teams.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/operations/teams");
    }

    @Test
    public void ReportProblems(){

        WebElement reportProblem = driver.findElement(By.linkText("Report problem"));
        reportProblem.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/reportProblem");
    }

    @Test
    public void Reservation(){

        WebElement reservation = driver.findElement(By.linkText("Reservation"));
        reservation.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/reservation");
    }

    @Test
    public void Rentals(){

        WebElement rentals = driver.findElement(By.linkText("Rentals"));
        rentals.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/rentals");
    }

    @Test
    public void Zones(){

        WebElement zones = driver.findElement(By.linkText("Zones"));
        zones.click();
        waitForFinding();

        String get_url = driver.getCurrentUrl();
        Assert.assertEquals(get_url,Configuration.ADMIN_URL +"/zones");
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




