import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
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

const routes: Routes = [
  { path: 'client' , component: ClientFormComponent},
  { path: 'dashboard' , component: DashboardComponent},
  { path: 'clientrevenue' , component: ClientrevenueComponent},
  { path: 'client-details' , component: ClientDetailsComponent},
  { path : 'billable' , component : BillableformComponent },
  { path : 'clientlogo' , component : ClientlogoComponent },
  { path :'pakdetails' , component : PakagedetailsComponent },
  { path : 'packform' , component : PackageformComponent},
  { path : 'billdash' , component : BilldashboardComponent },
  { path : 'nonbill' , component : NonbilldashComponent },
  { path : 'clidata' , component : ClientdataComponent },
  { path : 'billdata' , component : BillableDetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
