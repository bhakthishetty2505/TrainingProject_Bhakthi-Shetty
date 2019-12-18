import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ManagerComponent } from './manager/manager.component';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { AssetchildcComponent } from './assetchildc/assetchildc.component';
import { RegisterComponent } from './register/register.component';
import { AuthguardService } from './authguard.service';
import { AddAssetComponent } from './add-asset/add-asset.component';
import { HomeComponent } from './home/home.component';
import { ShowAllAssetComponent } from './show-all-asset/show-all-asset.component';
import { ModifyAssetComponent } from './modify-asset/modify-asset.component';
import { DeleteAssetComponent } from './delete-asset/delete-asset.component';
import { UserrequestComponent } from './userrequest/userrequest.component';


const routes: Routes = [
  {
    path: 'manager', component: ManagerComponent,
    canActivate: [AuthguardService], data: {
      role: ['manager', 'admin']
    }
  },
  {
    path: 'admin', component: AdminComponent,
    canActivate: [AuthguardService], data: {
      role: ['admin']
    }
  },
  { path: 'login', component: LoginComponent },
  {
    path: 'user', component: UserComponent,
    canActivate: [AuthguardService], data: { role: ['user', 'admin', 'manager'] }
  },
  { path: 'assetchild', component: AssetchildcComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'home', component: HomeComponent },
  { path: 'showall', component: ShowAllAssetComponent },
  { path: 'modify', component: ModifyAssetComponent },
  { path: 'delete', component: DeleteAssetComponent },
  { path: 'addasset', component: AddAssetComponent },
  { path: 'userrequest', component: UserrequestComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
