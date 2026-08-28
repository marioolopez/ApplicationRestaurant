import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderPrincipalComponent } from './header-principal.component';

describe('HeaderPrincipalComponent', () => {
  let component: HeaderPrincipalComponent;
  let fixture: ComponentFixture<HeaderPrincipalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HeaderPrincipalComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HeaderPrincipalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
