-- IdGeneratedEntityRepository_findChunk.sql

SELECT *
FROM id_generated_entities

/*IF orders != null*/
ORDER BY /*$orders*/id
/*END*/

/*BEGIN*/
LIMIT
	/*IF offset != null*/
	/*offset*/0,
	/*END*/

	/*IF size != null*/
	/*size*/10
	/*END*/
/*END*/
