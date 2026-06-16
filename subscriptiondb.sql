CREATE DATABASE subscriptiondb;

USE subscriptiondb;

CREATE TABLE subscriptions(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    plan VARCHAR(20),
    status VARCHAR(20)
);

CREATE INDEX idx_email
ON subscriptions(email);

CREATE VIEW active_subscriptions AS
SELECT *
FROM subscriptions
WHERE status='ACTIVE';

DELIMITER $$

CREATE PROCEDURE GetActiveSubscriptions()
BEGIN
    SELECT *
    FROM subscriptions
    WHERE status='ACTIVE';
END $$

DELIMITER ;