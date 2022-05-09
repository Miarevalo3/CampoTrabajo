import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InicioSesionComponent } from './Componentes/inicio-sesion/inicio-sesion.component';
import { RegistroUsuarioComponent } from './Componentes/registro-usuario/registro-usuario.component';
import { PaginaPrincipalComponent } from './Modelos/pagina-principal/pagina-principal.component';

@NgModule({
  declarations: [
    AppComponent,
    InicioSesionComponent,
    RegistroUsuarioComponent,
    PaginaPrincipalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
