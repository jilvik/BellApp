CREATE TABLE IF NOT EXISTS office (
    version       INTEGER       NOT NULL,

	org_id        INTEGER       NOT NULL,
	id            INTEGER       NOT NULL AUTO_INCREMENT,
	name          VARCHAR(40),
	address       VARCHAR(255),
	phone         VARCHAR(30),
	is_active     BOOLEAN       NOT NULL,

	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS organization (
    version       INTEGER       NOT NULL,

	id            INTEGER       NOT NULL AUTO_INCREMENT,
	name          VARCHAR(50)   NOT NULL,
	full_name     VARCHAR(100)  NOT NULL,
	inn           VARCHAR(12)   NOT NULL UNIQUE,
	kpp           VARCHAR(9)    NOT NULL,
	address       VARCHAR(255)  NOT NULL,
    phone         VARCHAR(30),
    is_active     BOOLEAN       NOT NULL,

	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS person (
    version       INTEGER       NOT NULL,

    id            INTEGER       NOT NULL AUTO_INCREMENT,
	office_id     INTEGER       NOT NULL,
	last_name     VARCHAR(20),
	first_name    VARCHAR(20)   NOT NULL,
	middle_name   VARCHAR(20),
	post          VARCHAR(30)   NOT NULL,
	phone         VARCHAR(20),
	document_id   INTEGER,
	country_id    INTEGER,
	is_identified BOOLEAN       NOT NULL,

	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS document (
    version       INTEGER       NOT NULL,

	id            INTEGER       NOT NULL AUTO_INCREMENT,
	doc_type_id   INTEGER,
	number        VARCHAR(30)            UNIQUE,
	issue_date    DATE,

	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS doc_type (
    version       INTEGER       NOT NULL,

	id            INTEGER       NOT NULL AUTO_INCREMENT,
    code          VARCHAR(2)    NOT NULL UNIQUE,
	name          VARCHAR(115)  NOT NULL UNIQUE,

	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS country (
    version       INTEGER       NOT NULL,

	id            INTEGER       NOT NULL AUTO_INCREMENT,
    code          VARCHAR(3)    NOT NULL UNIQUE,
	name          VARCHAR(30)   NOT NULL UNIQUE,

	PRIMARY KEY (id)
);

CREATE INDEX   IX_organization_id   ON office (org_id);
CREATE INDEX   IX_office_id         ON person (office_id);
CREATE INDEX   IX_country_id        ON person (country_id);
CREATE INDEX   IX_document_id       ON person (document_id);
CREATE INDEX   IX_doc_type_id       ON document (doc_type_id);

CREATE INDEX   UX_person_last_name  ON person (last_name);
CREATE INDEX   UX_document_number   ON document (number);

ALTER TABLE office    ADD FOREIGN KEY (org_id)       REFERENCES organization(id);
ALTER TABLE person    ADD FOREIGN KEY (office_id)    REFERENCES office(id);
ALTER TABLE person    ADD FOREIGN KEY (country_id)   REFERENCES country(id);
ALTER TABLE person    ADD FOREIGN KEY (document_id)  REFERENCES document(id);
ALTER TABLE document  ADD FOREIGN KEY (doc_type_id)  REFERENCES doc_type(id);

