import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnnouncementAppComponent } from './announcement-app.component';

describe('AnnouncementAppComponent', () => {
  let component: AnnouncementAppComponent;
  let fixture: ComponentFixture<AnnouncementAppComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnnouncementAppComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnnouncementAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
