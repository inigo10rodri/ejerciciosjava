DROP TABLE IF EXISTS "PLANTACIONES";
CREATE TABLE "PLANTACIONES" ("PARCELA" INTEGER NOT NULL , "FECHA_PLAN" TEXT NOT NULL , "FECHA_REC" TEXT, "ESPECIE" TEXT, "CANT_PLANT" INTEGER, "CANT_REC" INTEGER, PRIMARY KEY ("PARCELA", "FECHA_PLAN"));
INSERT INTO "PLANTACIONES" VALUES(1,'2017/08/09','2017/08/15','fresas',600,256);