define(function() {
	var models = function() {
		this.init = function () {
//			function person(id, firstName, lastName, email, phoneNumber, city,
//					postalCode, job) {
//				this.id = id;
//				this.firstName = firstName;
//				this.lastName = lastName;
//				this.email = email;
//				this.phoneNumber = phoneNumber;
//				this.city = city;
//				this.postalCode = postalCode;
//				this.job = job;
//			}
			
			var person1 = new person("p1", "Nicolas1", "Mine1",
					"nicolas.mine11@gmail.com", "0472537024", "Bruxelles", "1200",
					"developer");
			var person2 = new person("p2", "Nicolas2", "Mine2",
					"nicolas.mine11@gmail.com", "0472537024", "Bruxelles", "1200",
					"developer");
			var person3 = new person("p3", "Nicolas3", "Mine3",
					"nicolas.mine11@gmail.com", "0472537024", "Bruxelles", "1200",
					"developer");
			var person4 = new person("p4", "Nicolas4", "Mine4",
					"nicolas.mine11@gmail.com", "0472537024", "Bruxelles", "1200",
					"developer");
			var person5 = new person("p5", "Nicolas5", "Mine5",
					"nicolas.mine11@gmail.com", "0472537024", "Bruxelles", "1200",
					"developer");
			var persons = new Array(person1, person2, person3, person4, person5);
			initLocalStorageData();
			function initLocalStorageData() {
				persons.forEach(function(entry) {
					sessionStorage.setItem("" + entry.id, JSON.stringify(entry));
				});
			}
		};
	};
	return models;
});