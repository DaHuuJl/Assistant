import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatIconModule} from "@angular/material/icon";
import {MatButtonModule} from "@angular/material/button";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatOptionModule} from "@angular/material/core";
import {MatSelectModule} from "@angular/material/select";
import {MatDividerModule} from "@angular/material/divider";
import { HomeComponent } from './page/home/home.component';
import { MenuComponent } from './component/menu/menu.component';
import { HeaderComponent } from './component/header/header.component';
import {MatSidenavModule} from "@angular/material/sidenav";
import { EventsComponent } from './page/events/events.component';
import { AboutComponent } from './page/about/about.component';
import {MatMenuModule} from "@angular/material/menu";
import { ScheduleComponent } from './page/schedule/schedule.component';
import { ProfileComponent } from './page/profile/profile.component';
import { SettingsComponent } from './page/settings/settings.component';
import { NotFoundComponent } from './page/not-found/not-found.component';
import {MatListModule} from "@angular/material/list";
import { GradeBookComponent } from './page/grade-book/grade-book.component';
import { ReferenceComponent } from './page/reference/reference.component';
import { DocumentsComponent } from './page/documents/documents.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MenuComponent,
    HeaderComponent,
    EventsComponent,
    AboutComponent,
    ScheduleComponent,
    ProfileComponent,
    SettingsComponent,
    NotFoundComponent,
    GradeBookComponent,
    ReferenceComponent,
    DocumentsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatOptionModule,
    MatSelectModule,
    MatDividerModule,
    MatSidenavModule,
    MatMenuModule,
    MatListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
