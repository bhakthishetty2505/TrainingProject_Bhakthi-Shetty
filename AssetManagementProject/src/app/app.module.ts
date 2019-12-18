import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { ManagerComponent } from './manager/manager.component';
import { UserComponent } from './user/user.component';
import { AssetchildcComponent } from './assetchildc/assetchildc.component';
import { HeaderComponent } from './header/header.component';
import { RegisterComponent } from './register/register.component';
import { HttpClientModule } from '@angular/common/http';
import { AddAssetComponent } from './add-asset/add-asset.component';
import { HomeComponent } from './home/home.component';
import { DeleteAssetComponent } from './delete-asset/delete-asset.component';
import { ModifyAssetComponent } from './modify-asset/modify-asset.component';
import { ShowAllAssetComponent } from './show-all-asset/show-all-asset.component';
import { UserrequestComponent } from './userrequest/userrequest.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    ManagerComponent,
    UserComponent,
    AssetchildcComponent,
    HeaderComponent,
    RegisterComponent,
    AddAssetComponent,
    HomeComponent,
    DeleteAssetComponent,
    ModifyAssetComponent,
    ShowAllAssetComponent,
    UserrequestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
