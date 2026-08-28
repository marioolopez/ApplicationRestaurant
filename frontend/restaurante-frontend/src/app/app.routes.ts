import { Routes } from '@angular/router';
import { MainPrincipalComponent } from './components/main-principal/main-principal.component';
import { CartaProductosComponent } from './components/carta-productos/carta-productos.component';
import { InicioSesionComponent } from './components/inicio-sesion/inicio-sesion.component';
import { QuienSomosComponent } from './components/quien-somos/quien-somos.component';
export const routes: Routes = [
  { path: 'main', component: MainPrincipalComponent }, //primer componente que carga...
  { path: 'carta', component: CartaProductosComponent }, //te lleva al componente donde esta toda la carta solo para visualizar
  { path: 'inicio', component: InicioSesionComponent}, //te lleva al componente Inicio de Sesion donde te logeas
  { path: 'cononcenos', component: QuienSomosComponent}, //componente "quienes somos", en el HEADER
  { path: '**', redirectTo: 'main' }
];
