import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FooterPrincipalComponent } from './footer-principal.component';

describe('FooterPrincipalComponent', () => {
  let component: FooterPrincipalComponent;
  let fixture: ComponentFixture<FooterPrincipalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FooterPrincipalComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FooterPrincipalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
