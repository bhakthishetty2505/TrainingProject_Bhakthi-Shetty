import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowAllAssetComponent } from './show-all-asset.component';

describe('ShowAllAssetComponent', () => {
  let component: ShowAllAssetComponent;
  let fixture: ComponentFixture<ShowAllAssetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowAllAssetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowAllAssetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
