const newman = require('newman');

newman.run(
	{
		collection: require('./collection/CaseOneTest.json'), // pointing to local JSON file.
		// environment: require('./collection/customer_api_env.json'),
		iterationCount: 1,
		reporters: 'htmlextra',
		reporter: {
			htmlextra: {
				export: './Reports/report.html',
			},
		},
	},
	function (err) {
		if (err) {
			throw err;
		}
		console.log('collection run complete!');
	}
);
