alter table CLOUDSTACK_CERTIFICATE add constraint CLOUDSTACK_CERTIFICATE_FK1 foreign key (ACCOUNT) references USER (USER_NO);
alter table CLOUDSTACK_CERTIFICATE add constraint CLOUDSTACK_CERTIFICATE_FK2 foreign key (PLATFORM_NO) references PLATFORM (PLATFORM_NO);
