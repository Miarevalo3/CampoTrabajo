import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioSesionComponent } from './Componentes/inicio-sesion/inicio-sesion.component';
import { PaginaPrincipalComponent } from './Componentes/pagina-principal/pagina-principal.component';
import { RegistroUsuarioComponent } from './Componentes/registro-usuario/registro-usuario.component';

const routes: Routes = [
  {path: 'index', component: PaginaPrincipalComponent},
  {path: 'registro', component: RegistroUsuarioComponent},
  {path: 'login', component: InicioSesionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
