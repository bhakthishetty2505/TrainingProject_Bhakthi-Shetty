import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { JwPaginationComponent } from 'jw-angular-pagination';
import { HighchartsChartModule } from 'highcharts-angular';
import { FusionChartsModule } from "angular-fusioncharts";
import * as FusionCharts from "fusioncharts";
import * as Widgets from "fusioncharts/fusioncharts.widgets";

import * as FusionTheme from "fusioncharts/themes/fusioncharts.theme.fusion";

FusionChartsModule.fcRoot(FusionCharts, Widgets, FusionTheme);



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ClientFormComponent } from './client-form/client-form.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ClientDetailsComponent } from './client-details/client-details.component';
import { ClientrevenueComponent } from './clientrevenue/clientrevenue.component';
import { BillableformComponent } from './billableform/billableform.component';
import { ClientlogoComponent } from './clientlogo/clientlogo.component';
import { PakagedetailsComponent } from './pakagedetails/pakagedetails.component';
import { PackageformComponent } from './packageform/packageform.component';
import { BilldashboardComponent } from './billdashboard/billdashboard.component';
import { NonbilldashComponent } from './nonbilldash/nonbilldash.component';
import { ClientdataComponent } from './clientdata/clientdata.component';
import { BillableDetailsComponent } from './billable-details/billable-details.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    ClientFormComponent,
    DashboardComponent,
    ClientDetailsComponent,
    JwPaginationComponent,
    ClientrevenueComponent,
    BillableformComponent,
    ClientlogoComponent,
    PakagedetailsComponent,
    PackageformComponent,
    BilldashboardComponent,
    NonbilldashComponent,
    ClientdataComponent,
    BillableDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    FusionChartsModule,
    HighchartsChartModule,
    BrowserAnimationsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
