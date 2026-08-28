import { Component } from '@angular/core';
import { HeaderPrincipalComponent } from './components/header-principal/header-principal.component';
import { FooterPrincipalComponent } from './components/footer-principal/footer-principal.component';
import { RouterOutlet } from '@angular/router';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HeaderPrincipalComponent, FooterPrincipalComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'restaurante-frontend';
}
