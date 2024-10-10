DELETE FROM city;
DELETE FROM city_city_names;
DELETE FROM location;
DELETE FROM city_locations;

INSERT INTO city(id, country)
VALUES ('12d96e44-a623-4e7e-aced-25422bbc0938', 'PL'),
       ('ea139adb-2c5e-428b-bb27-7f9d1265dfdc', 'PL'),
       ('0f7084a3-13d2-4afa-b5e5-9e7df3718d32', 'PL');

INSERT INTO city_city_names(city_id, name, lang)
VALUES ('12d96e44-a623-4e7e-aced-25422bbc0938', 'Warsaw', 'EN'),
       ('12d96e44-a623-4e7e-aced-25422bbc0938', 'Warszawa', 'PL'),
       ('ea139adb-2c5e-428b-bb27-7f9d1265dfdc', 'Kraków', 'PL'),
       ('ea139adb-2c5e-428b-bb27-7f9d1265dfdc', 'Cracow', 'EN'),
       ('0f7084a3-13d2-4afa-b5e5-9e7df3718d32', 'Warka', 'PL'),
       ('0f7084a3-13d2-4afa-b5e5-9e7df3718d32', 'Warka', 'EN');

INSERT INTO location(id, name, street)
VALUES ('b44a02e8-8e04-4afc-bf97-feb84c0e113a', 'Centrum Sportowe AZOTY', 'ul.Warszawaska 12'),
       ('d2a5cf2e-c9e7-4ab9-959c-3bb990572b98', 'Szkoła Podstawowa nr 10', 'ul.Dworcowa 5'),
       ('6e10eb1b-a218-48f1-a17e-77edc1ed16b9', 'Hala sportowa Warszawka', 'ul. Armii Krajowej 3'),

       ('c52cdff1-cb9e-47e4-9680-97098fa146d0', 'Centrum Sportowe AZOTY', 'ul.Warszawaska 13'),
       ('ed45c086-f58c-49a1-8891-61eadba1d317', 'Szkoła Podstawowa nr 11', 'ul.Dworcowa 6'),
       ('0aaf08f7-7c23-4dbe-bea9-c5374918bc6f', 'Hala sportowa Krakow', 'ul. Armii Krajowej 4'),

       ('161924ad-8a6d-49dc-ac8c-cd6b3c7cf5c4', 'Centrum Sportowe AZOTY', 'ul.Warszawaska 14'),
       ('b28cbe19-0c4e-406f-9782-6fb0c3a6f7d4', 'Szkoła Podstawowa nr 12', 'ul.Dworcowa 7'),
       ('0499086a-2fd3-46c2-95e8-cae5835c8cfb', 'Hala sportowa ', 'ul. Armii Krajowej 5');

INSERT INTO city_locations(city_id, locations_id)
VALUES ('12d96e44-a623-4e7e-aced-25422bbc0938', 'b44a02e8-8e04-4afc-bf97-feb84c0e113a'),
       ('12d96e44-a623-4e7e-aced-25422bbc0938', 'd2a5cf2e-c9e7-4ab9-959c-3bb990572b98'),
       ('12d96e44-a623-4e7e-aced-25422bbc0938', '6e10eb1b-a218-48f1-a17e-77edc1ed16b9');