const newman = require('newman');

newman.run(
	{
		collection: require('./collection/assignment-api.json'),
		iterationCount: 1,
		reporters: 'htmlextra',
		reporter: {
			htmlextra: {
				export: './Reports/report.html',
			},
		},
	},
	(err) => {
		if (err) {
			throw err;
		}
		console.log('collection run complete!');
	}
);
