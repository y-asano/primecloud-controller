ALTER TABLE VCLOUD_CERTIFICATE ADD CONSTRAINT VCLOUD_CERTIFICATE_FK1 FOREIGN KEY (USER_NO) REFERENCES USER (USER_NO);
ALTER TABLE VCLOUD_CERTIFICATE ADD CONSTRAINT VCLOUD_CERTIFICATE_FK2 FOREIGN KEY (PLATFORM_NO) REFERENCES PLATFORM (PLATFORM_NO);