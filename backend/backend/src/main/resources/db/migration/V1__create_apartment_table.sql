    CREATE TABLE apartment (
    id BIGSERIAL PRIMARY KEY,
    number VARCHAR(20) NOT NULL,
    floor INTEGER NOT NULL,
    occupied BOOLEAN NOT NULL
);