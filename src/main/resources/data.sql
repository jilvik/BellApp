INSERT INTO country (country_code, country_name) VALUES ('643', 'Российская Федерация');
INSERT INTO country (country_code, country_name) VALUES ('398', 'Республика Казахстан');
INSERT INTO country (country_code, country_name) VALUES ('112', 'Республика Беларусь');
INSERT INTO country (country_code, country_name) VALUES ('031', 'Республика Азербайджан');
INSERT INTO country (country_code, country_name) VALUES ('052', 'Республика Армения');
INSERT INTO country (country_code, country_name) VALUES ('417', 'Киргизская Республика');
INSERT INTO country (country_code, country_name) VALUES ('498', 'Республика Молдова');
INSERT INTO country (country_code, country_name) VALUES ('762', 'Республика Таджикистан');
INSERT INTO country (country_code, country_name) VALUES ('860', 'Республика Узбекистан');
INSERT INTO country (country_code, country_name) VALUES ('795', 'Туркменистан');


INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '03',
       'Свидетельство о рождении'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '07',
       'Военный билет'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '08',
       'Временное удостоверение, выданное взамен военного билета'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '10',
       'Паспорт иностранного гражданина'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '11',
       'Свидетельство о рассмотрении ходатайства о признании лица беженцем на территории Российской Федерации по существу'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '12',
       'Вид на жительство в Российской Федерации'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '13',
       'Удостоверение беженца'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '15',
       'Разрешение на временное проживание в Российской Федерации'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '18',
       'Свидетельство о предоставлении временного убежища на территории Российской Федерации'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '21',
       'Паспорт гражданина Российской Федерации'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '23',
       'Свидетельство о рождении, выданное уполномоченным органом иностранного государства'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '24',
       'Удостоверение личности военнослужащего Российской Федерации'
);
INSERT INTO doc_type (doc_type_code, doc_type_name) VALUES (
       '91',
       'Иные документы'
);


INSERT INTO organization (org_full_name, org_inn, org_kpp) VALUES (
       'Автосервис "У Ашота"',
       '194038920015',
       '000539321'
);
INSERT INTO organization (org_full_name, org_inn, org_kpp) VALUES (
       'Средний муниципальный образовательный центр №429',
       '939601840037',
       '92601112'
);
INSERT INTO organization (org_full_name, org_inn, org_kpp) VALUES (
       'Кофейня "На луне"',
       '000003749148',
       '389000123'
);

INSERT INTO office (org_id, office_name, office_address, office_phone) VALUES (
       1,
       'Офис на ленинградке',
       'Леннинградское шоссе, 147с2',
       '+7 495 138 03 48'
);
INSERT INTO office (org_id, office_name, office_address, office_phone) VALUES (
       2,
       'Корпус 1',
       'Улица Володарского, 64',
       '+7 495 444 23 50'
);
INSERT INTO office (org_id, office_name, office_address, office_phone) VALUES (
       3,
       'ТЦ "Атриум"',
       'Земляной вал, 33',
       '+7 495 138 03 48'
);
INSERT INTO office (org_id, office_name, office_address, office_phone) VALUES (
       3,
       'ТЦ "Метрополис"',
       'Ленинградское шоссе, 16Ас4',
       '+7 495 138 03 48'
);


INSERT INTO document (doc_type_id, document_number, document_date) VALUES (
       4,
       '3496123',
       '2018-10-26'
);
INSERT INTO person (office_id, last_name, first_name, middle_name, post, phone, document_id, country_id) VALUES (
       1,
       'Абдулаев',
       'Ашот',
       'Фагизович',
       'Директор',
       '+7 903 490 32 23',
       1,
       4
);

INSERT INTO document (doc_type_id, document_number, document_date) VALUES (
       10,
       '2408 39501839',
       '2002-11-13'
);
INSERT INTO person (office_id, last_name, first_name, middle_name, post, phone, document_id, country_id) VALUES (
       2,
       'Павлова',
       'Светлана',
       'Евгеньевна',
       'Учитель химии',
       '+7 903 490 32 23',
       2,
       1
);

INSERT INTO document (doc_type_id, document_number, document_date) VALUES (
       10,
       '4609 45671300',
       '2014-04-02'
);
INSERT INTO person (office_id, last_name, first_name, middle_name, post, phone, document_id, country_id) VALUES (
       3,
       'Толоконников',
       'Дмитрий',
       'Эдуардович',
       'Барриста',
       '+7 911 009 11 99',
       3,
       1
);
