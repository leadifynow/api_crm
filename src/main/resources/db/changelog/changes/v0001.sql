-- Changeset v0001
-- Table creation
CREATE TABLE IF NOT EXISTS interested (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    second_name VARCHAR(255),
    business_name VARCHAR(255) NULL,
    email VARCHAR(255) NOT NULL,
    campaign VARCHAR(255) NOT NULL,
    interest_date TIMESTAMP NOT NULL,
    booked BOOLEAN NOT NULL,
    stage VARCHAR(255) NOT NULL,
    notes VARCHAR(255),
    created TIMESTAMP,
    updated TIMESTAMP
);

-- Changeset v0002
-- Modify business_name to be nullable


-- Add NOT NULL constraint
-- This step is not necessary as the column will be nullable after the modification