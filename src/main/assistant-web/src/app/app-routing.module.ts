import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./page/home/home.component";
import {EventsComponent} from "./page/events/events.component";
import {AboutComponent} from "./page/about/about.component";
import {SettingsComponent} from "./page/settings/settings.component";
import {ProfileComponent} from "./page/profile/profile.component";
import {NotFoundComponent} from "./page/not-found/not-found.component";
import {ScheduleComponent} from "./page/schedule/schedule.component";
import {GradeBookComponent} from "./page/grade-book/grade-book.component";
import {ReferenceComponent} from "./page/reference/reference.component";
import {DocumentsComponent} from "./page/documents/documents.component";

const routes: Routes = [
  { path: '', component: HomeComponent },

  { path: 'about', component: AboutComponent },
  { path: 'home', redirectTo: '', component: HomeComponent },

  { path: 'profile', component: ProfileComponent },
  { path: 'settings', component: SettingsComponent },

  { path: 'schedule', component: ScheduleComponent },
  { path: 'grade-book', component: GradeBookComponent },
  { path: 'reference', component: ReferenceComponent },
  { path: 'documents', component: DocumentsComponent },
  { path: 'events', component: EventsComponent },

  { path: '**', component: NotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
