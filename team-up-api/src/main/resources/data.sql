INSERT INTO tu_team(id, date_time, open_group, team_size, created_by, team_id, location_id)
VALUES ('a458960b-b12b-4a38-9036-b68c94d0224c', null, true, 10, null, null, null)
ON CONFLICT DO NOTHING;

INSERT INTO sport(id, code, icon, team_id)
VALUES ('4dbe7a5d-9728-4169-9284-37d0f0261a4a', 'FOOTBALL', 'football.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
       ('3e0d701b-3e20-4bfa-bdc2-ae89545f43ec', 'VOLLEYBALL', 'volleyball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
       ('8a205e83-abf5-41a4-865e-051ddbcbd027', 'BASKETBALL', 'basketball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
       ('027e16a7-9445-47a7-b4c3-cb6f0dcaf682', 'BOWLING', 'bowling.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
       ('283de6c6-f06d-4844-aa91-62fcb4aaa441', 'HANDBALL', 'handball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
       ('2a94346f-95cb-4e12-b695-b8000efecb8d', 'HOCKEY', 'hockey.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
       ('7aecd5d5-0835-426f-b317-ef76eb3ff06c', 'LASER_TAG', 'laser-tag.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
       ('d1bae0e2-e6e6-4da9-95ee-73e8e2a32c97', 'PAINTBALL', 'paintball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
       ('3d13469d-fa14-4649-9d82-6c599e4a2763', 'FLOORBALL', 'floorball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c')
ON CONFLICT DO NOTHING;

INSERT INTO city(id, country)
VALUES ('12d96e44-a623-4e7e-aced-25422bbc0938', 'PL'),
       ('ea139adb-2c5e-428b-bb27-7f9d1265dfdc', 'PL'),
       ('0f7084a3-13d2-4afa-b5e5-9e7df3718d32', 'PL'),

       ('f94d59dc-a605-4348-a3d6-1145fdc60800', 'SE'),
       ('e02c37d2-6a8a-461b-b91a-917c39eab79b', 'SE'),
       ('d15a7acf-83de-4d87-95ee-2d525d07e8d4', 'SE'),

       ('bbc9b270-f367-4b04-bf6e-778561959ddd', 'UK'),
       ('ec8d8e85-cebd-4f84-b0dc-9a3bc5c778a5', 'UK'),
       ('a534e25c-2605-498e-b70e-de1c142cd036', 'UK'),

       ('07242c40-5de9-4a3a-9a7e-aea4772f7b7b', 'US'),
       ('5461f055-b19a-4d63-a280-0ec09b492e40', 'US'),
       ('0df290b3-070d-4155-a742-1238ef3acb86', 'US')
ON CONFLICT DO NOTHING;

INSERT INTO city_city_names(city_id, name, lang)
VALUES ('12d96e44-a623-4e7e-aced-25422bbc0938', 'Warsaw', 'EN'),
       ('12d96e44-a623-4e7e-aced-25422bbc0938', 'Warszawa', 'PL'),
       ('ea139adb-2c5e-428b-bb27-7f9d1265dfdc', 'Kraków', 'PL'),
       ('ea139adb-2c5e-428b-bb27-7f9d1265dfdc', 'Cracow', 'EN'),
       ('0f7084a3-13d2-4afa-b5e5-9e7df3718d32', 'Warka', 'PL'),
       ('0f7084a3-13d2-4afa-b5e5-9e7df3718d32', 'Warka', 'EN'),
       ('f94d59dc-a605-4348-a3d6-1145fdc60800', 'Sztokholm', 'PL'),
       ('f94d59dc-a605-4348-a3d6-1145fdc60800', 'Stockholm', 'EN'),
       ('e02c37d2-6a8a-461b-b91a-917c39eab79b', 'Uppsala', 'PL'),
       ('e02c37d2-6a8a-461b-b91a-917c39eab79b', 'Uppsala', 'EN'),
       ('d15a7acf-83de-4d87-95ee-2d525d07e8d4', 'Göteborg', 'PL'),
       ('d15a7acf-83de-4d87-95ee-2d525d07e8d4', 'Gothenburg', 'EN'),
       ('bbc9b270-f367-4b04-bf6e-778561959ddd', 'Londyn', 'PL'),
       ('ec8d8e85-cebd-4f84-b0dc-9a3bc5c778a5', 'Liverpool', 'PL'),
       ('bbc9b270-f367-4b04-bf6e-778561959ddd', 'London', 'EN'),
       ('ec8d8e85-cebd-4f84-b0dc-9a3bc5c778a5', 'Liverpool', 'EN'),
       ('07242c40-5de9-4a3a-9a7e-aea4772f7b7b', 'Nowy Jork', 'PL'),
       ('07242c40-5de9-4a3a-9a7e-aea4772f7b7b', 'New York', 'EN'),
       ('0df290b3-070d-4155-a742-1238ef3acb86', 'Waszyngton', 'PL'),
       ('0df290b3-070d-4155-a742-1238ef3acb86', 'Washington', 'EN'),
       ('5461f055-b19a-4d63-a280-0ec09b492e40', 'Los Angeles', 'EN'),
       ('5461f055-b19a-4d63-a280-0ec09b492e40', 'Los Angeles', 'PL')

ON CONFLICT DO NOTHING;

INSERT INTO location(id, name, street)
VALUES ('b44a02e8-8e04-4afc-bf97-feb84c0e113a', 'Centrum Sportowe AZOTY', 'ul.Warszawaska 12'),
       ('d2a5cf2e-c9e7-4ab9-959c-3bb990572b98', 'Szkoła Podstawowa nr 10', 'ul.Dworcowa 5'),
       ('6e10eb1b-a218-48f1-a17e-77edc1ed16b9', 'Hala sportowa Warszawka', 'ul. Armii Krajowej 3'),

       ('c52cdff1-cb9e-47e4-9680-97098fa146d0', 'Centrum Sportowe AZOTY', 'ul.Warszawaska 13'),
       ('ed45c086-f58c-49a1-8891-61eadba1d317', 'Szkoła Podstawowa nr 11', 'ul.Dworcowa 6'),
       ('0aaf08f7-7c23-4dbe-bea9-c5374918bc6f', 'Hala sportowa Krakow', 'ul. Armii Krajowej 4'),

       ('161924ad-8a6d-49dc-ac8c-cd6b3c7cf5c4', 'Centrum Sportowe AZOTY', 'ul.Warszawaska 14'),
       ('b28cbe19-0c4e-406f-9782-6fb0c3a6f7d4', 'Szkoła Podstawowa nr 12', 'ul.Dworcowa 7'),
       ('0499086a-2fd3-46c2-95e8-cae5835c8cfb', 'Hala sportowa ', 'ul. Armii Krajowej 5'),

       ('58d4d33a-e1db-4802-9deb-83c33336d50c', 'Stockholm hall', 'Vaksalagatan 4'),
       ('c509aed5-e568-4925-bee2-e1c7c1dc2b90', 'Stockholm sport center', 'Stålgatan 30'),
       ('8baa4627-e2ca-4dd0-b685-d9534a725882', 'Every Sportcenter', 'Vaksalagatan 3'),

       ('57b41646-54d7-42c5-a3fb-f38f7e7d4b43', 'Fyrishov hall', 'Vaksalagatan 5'),
       ('42ac5c42-4307-419f-ac34-3c73be817104', 'Uppsala sport center', 'Stålgatan 31'),
       ('627cb04e-7705-481c-92f5-1ac83d8e6e77', 'Every Sportcenter', 'Vaksalagatan 4'),

       ('2c82c064-9a23-4595-a432-08ffcaa6669b', 'Fyrishov hall', 'Vaksalagatan 6'),
       ('70210deb-8ef1-4949-9bdb-8fef38f8c2dc', 'Uppsala sport center', 'Stålgatan 32'),
       ('84c3e3bc-25c3-4ffc-a261-14bb3ca7a6fe', 'Every Sportcenter', 'Vaksalagatan 5'),

       ('7c87051c-cf98-4035-879c-51359ef7195d', 'London hall', 'BakerStreet 7'),
       ('ced1b82a-8b37-4eca-b505-0a6a20f1b1e9', 'London sport center', 'Kings Road 33'),
       ('9176320f-9fb7-4e91-b4c7-dc06f766fdbf', 'Every Sportcenter', 'BakerStreet 7'),

       ('78211bb4-8633-4d35-b8f9-5c8846889859', 'Liverpool hall', 'High Street 8'),
       ('83eaf539-6113-4d6a-9428-2c01b9a4e79e', 'Liverpool sport center', 'Park Road 34'),
       ('587c4d3c-ec86-4c71-82d5-9fb1d73d56ed', 'Every Sportcenter', 'Station Road 6'),

       ('127b0cfb-d186-42b1-9ded-91724ac213e2', 'New York hall', 'Maple Street 8'),
       ('5a7ae10f-1875-40fd-abc5-f86efecaf064', 'New York sport center', 'Elm Street 34'),
       ('cacd13b7-69cb-491a-b899-9224eb1bd5b5', 'Every Sportcenter', 'Main Street 6'),

       ('f0fa731f-ec6d-4196-9f9c-340cfdbcc6cd', 'Washington DC hall', '8th Street 8'),
       ('b96be5bc-bb88-4a9b-be39-ba69ab27fa9e', 'Washington DC sport center', '9th Street 34'),
       ('77008187-d35a-4e80-bd2a-9d03c471747f', 'Every Sportcenter', 'Main Street 6'),

       ('d4a2b620-5067-4585-9ca5-63b5752d446b', 'Los Angeles hall', 'Beverly Hills 8'),
       ('469f5d89-57df-41a7-a96a-c9bbe1a3f3c2', 'Los Angeles sport center', 'Beverly Hills 34'),
       ('06749d2c-f084-424b-b685-6891b27c222c', 'Every Sportcenter', 'Hollywood Street 6')

ON CONFLICT DO NOTHING;

INSERT INTO city_locations(city_id, locations_id)
VALUES ('12d96e44-a623-4e7e-aced-25422bbc0938', 'b44a02e8-8e04-4afc-bf97-feb84c0e113a'),
       ('12d96e44-a623-4e7e-aced-25422bbc0938', 'd2a5cf2e-c9e7-4ab9-959c-3bb990572b98'),
       ('12d96e44-a623-4e7e-aced-25422bbc0938', '6e10eb1b-a218-48f1-a17e-77edc1ed16b9'),

       ('ea139adb-2c5e-428b-bb27-7f9d1265dfdc', 'c52cdff1-cb9e-47e4-9680-97098fa146d0'),
       ('ea139adb-2c5e-428b-bb27-7f9d1265dfdc', 'ed45c086-f58c-49a1-8891-61eadba1d317'),
       ('ea139adb-2c5e-428b-bb27-7f9d1265dfdc', '0aaf08f7-7c23-4dbe-bea9-c5374918bc6f'),

       ('0f7084a3-13d2-4afa-b5e5-9e7df3718d32', '161924ad-8a6d-49dc-ac8c-cd6b3c7cf5c4'),
       ('0f7084a3-13d2-4afa-b5e5-9e7df3718d32', 'b28cbe19-0c4e-406f-9782-6fb0c3a6f7d4'),
       ('0f7084a3-13d2-4afa-b5e5-9e7df3718d32', '0499086a-2fd3-46c2-95e8-cae5835c8cfb'),

       ('f94d59dc-a605-4348-a3d6-1145fdc60800', '58d4d33a-e1db-4802-9deb-83c33336d50c'),
       ('f94d59dc-a605-4348-a3d6-1145fdc60800', 'c509aed5-e568-4925-bee2-e1c7c1dc2b90'),
       ('f94d59dc-a605-4348-a3d6-1145fdc60800', '8baa4627-e2ca-4dd0-b685-d9534a725882'),

       ('e02c37d2-6a8a-461b-b91a-917c39eab79b', '57b41646-54d7-42c5-a3fb-f38f7e7d4b43'),
       ('e02c37d2-6a8a-461b-b91a-917c39eab79b', '42ac5c42-4307-419f-ac34-3c73be817104'),
       ('e02c37d2-6a8a-461b-b91a-917c39eab79b', '627cb04e-7705-481c-92f5-1ac83d8e6e77'),

       ('d15a7acf-83de-4d87-95ee-2d525d07e8d4', '2c82c064-9a23-4595-a432-08ffcaa6669b'),
       ('d15a7acf-83de-4d87-95ee-2d525d07e8d4', '70210deb-8ef1-4949-9bdb-8fef38f8c2dc'),
       ('d15a7acf-83de-4d87-95ee-2d525d07e8d4', '627cb04e-7705-481c-92f5-1ac83d8e6e77'),

       ('bbc9b270-f367-4b04-bf6e-778561959ddd', '7c87051c-cf98-4035-879c-51359ef7195d'),
       ('bbc9b270-f367-4b04-bf6e-778561959ddd', 'ced1b82a-8b37-4eca-b505-0a6a20f1b1e9'),
       ('bbc9b270-f367-4b04-bf6e-778561959ddd', '9176320f-9fb7-4e91-b4c7-dc06f766fdbf'),

       ('ec8d8e85-cebd-4f84-b0dc-9a3bc5c778a5', '78211bb4-8633-4d35-b8f9-5c8846889859'),
       ('ec8d8e85-cebd-4f84-b0dc-9a3bc5c778a5', '83eaf539-6113-4d6a-9428-2c01b9a4e79e'),
       ('ec8d8e85-cebd-4f84-b0dc-9a3bc5c778a5', '587c4d3c-ec86-4c71-82d5-9fb1d73d56ed'),

       ('07242c40-5de9-4a3a-9a7e-aea4772f7b7b', '127b0cfb-d186-42b1-9ded-91724ac213e2'),
       ('07242c40-5de9-4a3a-9a7e-aea4772f7b7b', '5a7ae10f-1875-40fd-abc5-f86efecaf064'),
       ('07242c40-5de9-4a3a-9a7e-aea4772f7b7b', 'cacd13b7-69cb-491a-b899-9224eb1bd5b5'),

       ('0df290b3-070d-4155-a742-1238ef3acb86', '77008187-d35a-4e80-bd2a-9d03c471747f'),
       ('0df290b3-070d-4155-a742-1238ef3acb86', 'b96be5bc-bb88-4a9b-be39-ba69ab27fa9e'),
       ('0df290b3-070d-4155-a742-1238ef3acb86', 'f0fa731f-ec6d-4196-9f9c-340cfdbcc6cd'),

       ('5461f055-b19a-4d63-a280-0ec09b492e40', 'd4a2b620-5067-4585-9ca5-63b5752d446b'),
       ('5461f055-b19a-4d63-a280-0ec09b492e40', '469f5d89-57df-41a7-a96a-c9bbe1a3f3c2'),
       ('5461f055-b19a-4d63-a280-0ec09b492e40', '06749d2c-f084-424b-b685-6891b27c222c')

ON CONFLICT DO NOTHING;






