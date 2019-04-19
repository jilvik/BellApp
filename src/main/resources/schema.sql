CREATE TABLE IF NOT EXISTS office (
	org_id            INT           NOT NULL,
	office_id         INT           NOT NULL AUTO_INCREMENT,
	office_name       VARCHAR(40)   NOT NULL,
	office_address    VARCHAR(255)  NOT NULL,
	office_phone      VARCHAR(30)   NOT NULL,

	PRIMARY KEY (office_id)
);

CREATE TABLE IF NOT EXISTS organization (
	org_id            INT           NOT NULL AUTO_INCREMENT,
	org_full_name     VARCHAR(100)  NOT NULL,
	org_inn           VARCHAR(12)   NOT NULL UNIQUE,
	org_kpp           VARCHAR(9)    NOT NULL UNIQUE,

	PRIMARY KEY (org_id)
);

CREATE TABLE IF NOT EXISTS person (
    person_id         INT           NOT NULL AUTO_INCREMENT,
	office_id         INT           NOT NULL,
	last_name         VARCHAR(20)   NOT NULL,
	first_name        VARCHAR(20)   NOT NULL,
	middle_name       VARCHAR(20),
	post              VARCHAR(30)   NOT NULL,
	phone             VARCHAR(20)   NOT NULL,
	document_id       INT           NOT NULL,
	country_id        INT           NOT NULL,

	PRIMARY KEY (person_id)
);

CREATE TABLE IF NOT EXISTS document (
	document_id       INT           NOT NULL AUTO_INCREMENT,
	doc_type_id       INT(11)       NOT NULL,
	document_number   VARCHAR(30)   NOT NULL UNIQUE,
	document_date     DATE(30)      NOT NULL,

	PRIMARY KEY (document_id)
);

CREATE TABLE IF NOT EXISTS doc_type (
	doc_type_id       INT           NOT NULL AUTO_INCREMENT,
    doc_type_code     VARCHAR(2)    NOT NULL UNIQUE,
	doc_type_name     VARCHAR(115)  NOT NULL UNIQUE,

	PRIMARY KEY (doc_type_id)
);

CREATE TABLE IF NOT EXISTS country (
	country_id        INT           NOT NULL AUTO_INCREMENT,
    country_code      VARCHAR(5)    NOT NULL UNIQUE,
	country_name      VARCHAR(30)   NOT NULL UNIQUE,

	PRIMARY KEY (country_id)
);

CREATE INDEX   IX_organization_id   ON office (org_id);
CREATE INDEX   IX_office_id         ON person (office_id);
CREATE INDEX   IX_country_id        ON person (country_id);
CREATE INDEX   IX_document_id       ON person (document_id);
CREATE INDEX   IX_doc_type_id       ON document (doc_type_id);

CREATE INDEX   UX_person_last_name  ON person (last_name);
CREATE INDEX   UX_document_number   ON document (document_number);

ALTER TABLE office    ADD FOREIGN KEY (org_id)       REFERENCES organization(org_id);
ALTER TABLE person    ADD FOREIGN KEY (office_id)    REFERENCES office(office_id);
ALTER TABLE person    ADD FOREIGN KEY (country_id)   REFERENCES country(country_id);
ALTER TABLE person    ADD FOREIGN KEY (document_id)  REFERENCES document(document_id);
ALTER TABLE document  ADD FOREIGN KEY (doc_type_id)  REFERENCES doc_type(doc_type_id);

