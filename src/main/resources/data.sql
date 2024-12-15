INSERT INTO bank (bank_name) VALUES
('KBZ Bank'),
('AYA Bank'),
('CB Bank'),
('Wave Money'),
('KBZ Pay');

-- Insert data into bank_type table
-- Make sure these match exactly with your ENUM definition
INSERT INTO bank_type (type) VALUES
('E_WALLET'),  -- Changed from 'E-WALLET' to 'E_WALLET'
('CARD'),
('VISA');

-- Insert data into payment table
INSERT INTO payment (bank_id, bank_type_id) VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 3),
(4, 1),
(5, 1);

-- Insert data into region table
INSERT INTO region (country) VALUES
('Myanmar'),
('Thailand'),
('Singapore');

-- Insert data into region_and_bank table
INSERT INTO region_and_bank (region_id, bank_id) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(2, 1);