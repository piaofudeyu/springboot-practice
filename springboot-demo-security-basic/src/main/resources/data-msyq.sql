insert into t_account(pwd)

select tmp.*

from (
	(select '12' as pwd)
	union all
	(select '34' as pwd)
) tmp
WHERE NOT EXISTS  (select * from t_account);