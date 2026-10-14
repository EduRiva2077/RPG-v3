-- TEBM V3 — Initial Schema
-- Phase 0: proves PostgreSQL + Flyway are working.
-- No domain entities yet. Only infrastructure metadata.

CREATE TABLE schema_info (
    key   VARCHAR(60)  PRIMARY KEY,
    value VARCHAR(255) NOT NULL
);

INSERT INTO schema_info (key, value)
VALUES ('phase',   '0'),
       ('version', 'v3.0.0-phase0');
