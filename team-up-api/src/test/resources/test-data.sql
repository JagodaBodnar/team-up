DELETE FROM tu_team;
DELETE FROM tu_user;
DELETE FROM location;

INSERT INTO tu_team(id,date_time, open_group, team_size,created_by,team_id, location_id)
values('ab09d389-ff36-43ed-8b2b-4892438e46af', null, true,10, null, null, null);

INSERT INTO tu_user(id, email, name, phone_number)
values ('9500b3e4-72e5-46d1-93af-30f771c192bd', 'test@gmail.com', 'John Doe', '555-444-333');

INSERT INTO  location(id, name,street)
values ('9b5dcb09-bd42-4306-a964-da0727c44a68', 'Sport Center', 'Baker Street');




