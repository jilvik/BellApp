INSERT INTO country (version, code, name) VALUES (1, '643', 'Российская Федерация');
INSERT INTO country (version, code, name) VALUES (1, '398', 'Республика Казахстан');
INSERT INTO country (version, code, name) VALUES (1, '112', 'Республика Беларусь');
INSERT INTO country (version, code, name) VALUES (1, '031', 'Республика Азербайджан');
INSERT INTO country (version, code, name) VALUES (1, '052', 'Республика Армения');
INSERT INTO country (version, code, name) VALUES (1, '417', 'Киргизская Республика');
INSERT INTO country (version, code, name) VALUES (1, '498', 'Республика Молдова');
INSERT INTO country (version, code, name) VALUES (1, '762', 'Республика Таджикистан');
INSERT INTO country (version, code, name) VALUES (1, '860', 'Республика Узбекистан');
INSERT INTO country (version, code, name) VALUES (1, '795', 'Туркменистан');


INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '03',
       'Свидетельство о рождении'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '07',
       'Военный билет'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '08',
       'Временное удостоверение, выданное взамен военного билета'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '10',
       'Паспорт иностранного гражданина'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '11',
       'Свидетельство о рассмотрении ходатайства о признании лица беженцем на территории Российской Федерации по существу'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '12',
       'Вид на жительство в Российской Федерации'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '13',
       'Удостоверение беженца'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '15',
       'Разрешение на временное проживание в Российской Федерации'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '18',
       'Свидетельство о предоставлении временного убежища на территории Российской Федерации'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '21',
       'Паспорт гражданина Российской Федерации'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '23',
       'Свидетельство о рождении, выданное уполномоченным органом иностранного государства'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '24',
       'Удостоверение личности военнослужащего Российской Федерации'
);
INSERT INTO doc_type (version, code, name) VALUES (
       1,
       '91',
       'Иные документы'
);


INSERT INTO organization (version, full_name, inn, kpp) VALUES (
       1,
       'Автосервис "У Ашота"',
       '194038920015',
       '000539321'
);
INSERT INTO organization (version, full_name, inn, kpp) VALUES (
       1,
       'Средний муниципальный образовательный центр №429',
       '939601840037',
       '92601112'
);
INSERT INTO organization (version, full_name, inn, kpp) VALUES (
       1,
       'Кофейня "На луне"',
       '000003749148',
       '389000123'
);

INSERT INTO office (version, org_id, name, address, phone) VALUES (
       1,
       1,
       'Офис на ленинградке',
       'Леннинградское шоссе, 147с2',
       '+7 495 138 03 48'
);
INSERT INTO office (version, org_id, name, address, phone) VALUES (
       1,
       2,
       'Корпус 1',
       'Улица Володарского, 64',
       '+7 495 444 23 50'
);
INSERT INTO office (version, org_id, name, address, phone) VALUES (
       1,
       3,
       'ТЦ "Атриум"',
       'Земляной вал, 33',
       '+7 495 138 03 48'
);
INSERT INTO office (version, org_id, name, address, phone) VALUES (
       1,
       3,
       'ТЦ "Метрополис"',
       'Ленинградское шоссе, 16Ас4',
       '+7 495 138 03 48'
);


INSERT INTO document (version, doc_type_id, number, issue_date) VALUES (
       1,
       4,
       '3496123',
       '2018-10-26'
);
INSERT INTO person (version, office_id, last_name, first_name, middle_name, post, phone, document_id, country_id) VALUES (
       1,
       1,
       'Абдулаев',
       'Ашот',
       'Фагизович',
       'Директор',
       '+7 903 490 32 23',
       1,
       4
);

INSERT INTO document (version, doc_type_id, number, issue_date) VALUES (
       1,
       10,
       '2408 39501839',
       '2002-11-13'
);
INSERT INTO person (version, office_id, last_name, first_name, middle_name, post, phone, document_id, country_id) VALUES (
       1,
       2,
       'Павлова',
       'Светлана',
       'Евгеньевна',
       'Учитель химии',
       '+7 903 490 32 23',
       2,
       1
);

INSERT INTO document (version, doc_type_id, number, issue_date) VALUES (
       1,
       10,
       '4609 45671300',
       '2014-04-02'
);
INSERT INTO person (version, office_id, last_name, first_name, middle_name, post, phone, document_id, country_id) VALUES (
       1,
       3,
       'Толоконников',
       'Дмитрий',
       'Эдуардович',
       'Барриста',
       '+7 911 009 11 99',
       3,
       1
);
