INSERT INTO item_type (name)
VALUES ('CPU');
INSERT INTO item_type (name)
VALUES ('MBO');
INSERT INTO item_type (name)
VALUES ('RAM');
INSERT INTO item_type (name)
VALUES ('STORAGE');
INSERT INTO item_type (name)
VALUES ('OTHER');

INSERT INTO hardware (code, name, price, type_id, amount)
VALUES ('3437932', 'AMD RYZEN 7', 400, 1, 5);
INSERT INTO hardware (code, name, price, type_id, amount)
VALUES ('45343250', 'Intel Core Ultra 7', 250, 1, 4);
INSERT INTO hardware (code, name, price, type_id, amount)
VALUES ('4592351', 'G.Skill Trident Z5 RGB DDR5-6000', 600, 3, 7);
INSERT INTO hardware (code, name, price, type_id, amount)
VALUES ('6789026', 'GeForce RTX 5090', 1900, 5, 12);