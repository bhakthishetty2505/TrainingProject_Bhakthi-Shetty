import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AssetchildcComponent } from './assetchildc.component';

describe('AssetchildcComponent', () => {
  let component: AssetchildcComponent;
  let fixture: ComponentFixture<AssetchildcComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AssetchildcComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AssetchildcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
