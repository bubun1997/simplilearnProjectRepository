import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './component/home/home.component';
import { AboutsComponent } from './component/abouts/abouts.component';
import { RouterModule, Routes } from '@angular/router';

const routes:Routes = [

  {path : 'home', component : HomeComponent},
  {path : 'abouts' , component :AboutsComponent},
  {path : '', redirectTo: '/home', pathMatch: 'full'},

]
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
