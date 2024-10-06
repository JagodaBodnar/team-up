INSERT INTO tu_team(id, date_time, open_group,team_size,created_by,team_id,location_id)
values('a458960b-b12b-4a38-9036-b68c94d0224c', null, true, 10, null, null, null) ON CONFLICT DO NOTHING;

INSERT INTO sport(id,code,icon,team_id)
values('4dbe7a5d-9728-4169-9284-37d0f0261a4a', 'FOOTBALL', 'football.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
      ('3e0d701b-3e20-4bfa-bdc2-ae89545f43ec', 'VOLLEYBALL', 'volleyball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
      ('8a205e83-abf5-41a4-865e-051ddbcbd027', 'BASKETBALL', 'basketball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
      ('027e16a7-9445-47a7-b4c3-cb6f0dcaf682', 'BOWLING', 'bowling.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
      ('283de6c6-f06d-4844-aa91-62fcb4aaa441','HANDBALL', 'handball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
      ('2a94346f-95cb-4e12-b695-b8000efecb8d', 'HOCKEY', 'hockey.svg','a458960b-b12b-4a38-9036-b68c94d0224c'),
      ('7aecd5d5-0835-426f-b317-ef76eb3ff06c', 'LASER_TAG', 'laser-tag.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
      ('d1bae0e2-e6e6-4da9-95ee-73e8e2a32c97', 'PAINTBALL', 'paintball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c'),
      ('3d13469d-fa14-4649-9d82-6c599e4a2763', 'FLOORBALL', 'floorball.svg', 'a458960b-b12b-4a38-9036-b68c94d0224c') ON CONFLICT DO NOTHING;