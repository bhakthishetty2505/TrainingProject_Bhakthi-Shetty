import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifyAssetComponent } from './modify-asset.component';

describe('ModifyAssetComponent', () => {
  let component: ModifyAssetComponent;
  let fixture: ComponentFixture<ModifyAssetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifyAssetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifyAssetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
