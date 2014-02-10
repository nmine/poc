/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Navigation
define(function() {
	var navigation = function() {
		this.init = function() {

			$("#contact").hide();
			$("#listing").hide();
			$("#create").hide();
			$("#update").hide();
			// $("#presentation").hide();
			// initLocalStorageData();
			$('div.header-top a').on('click changePlaceEvent', function(e) {
				switch (place = e.target.text.toLowerCase()) {
				case ('presentation'):
					setActivePage();
					currentPlace = 'presentation';
					break;
				case ('contact'):
					setActivePage();
					currentPlace = 'contact';
					break;
				case ('listing'):
					setActivePage();
					currentPlace = 'listing';
					break;
				default:
					break;
				}
			});
			function setActivePage() {
				if (currentPlace === 'presentation' && place === 'presentation') {

				} else if (currentPlace === 'presentation'
						&& place === 'contact') {
					$('#presentation').fadeOut('slow', function() {
						$("#contact").fadeIn('slow');
					});
				} else if (currentPlace === 'presentation'
						&& place === 'listing') {
					fillListingPage();
				} else if (currentPlace === 'contact' && place === 'contact') {

				} else if (currentPlace === 'contact'
						&& place === 'presentation') {
					$("#contact").fadeOut('slow', function() {
						$("#presentation").fadeIn('slow');
					});
				} else if (currentPlace === 'contact' && place === 'listing') {
					$("#contact").fadeOut('slow', function() {
						fillListingPage();
					});
				} else if (currentPlace === 'listing' && place === 'listing') {
					// Create page -> Listing page
					$("#update").fadeOut();
					$("#create").fadeOut('slow', function() {
						fillListingPage();
					});
				} else if (currentPlace === 'listing'
						&& place === 'presentation') {
					$("#update").fadeOut();
					$("#listing").fadeOut('slow', function() {
						$("#presentation").fadeIn('slow');
					});
				} else if (currentPlace === 'listing' && place === 'contact') {
					$("#update").fadeOut();
					$("#create").fadeOut('slow');
					$("#listing").fadeOut('slow', function() {
						$("#contact").fadeIn('slow');
					});
				}
			}

			function fillListingPage() {
				$('#listing .block').empty();
				$('#presentation')
						.fadeOut(
								'slow',
								function() {
									$("#listing")
											.fadeIn(
													'slow',
													function() {
														for ( var key in sessionStorage) {
															var personJSON = sessionStorage
																	.getItem(key);
															var personObject = JSON
																	.parse(personJSON);
															$('#listing .block')
																	.append(
																			"<section class='row-listing-table'><span class='edit-data'>"
																					+ personObject.firstName
																					+ "</span><span class='edit-data'> "
																					+ personObject.lastName
																					+ "</span><span class='edit-data'>"
																					+ personObject.job
																					+ "</span><a class='modify-person-anchor edit-data' > <img class='edit-button' src='img/edit.png' id="
																					+ key
																					+ " /></a>"
																					+ "</section>");

														}
														$('#listing .block')
																.append(
																		"<span id='create-person'>Create Person <img class='add-button' src='img/add.png'/></span>");
													});
								});
			}

			// MODEL

			var idPersonToModify;

			$("#submit-person").click(
					function() {
						var personToSave = new person("p"
								+ (sessionStorage.length + 1), $(
								'#form-firstname').val(), $('#form-lastname')
								.val(), $('#form-email').val(),
								$('#form-phone').val(), $('#form-city').val(),
								$('#form-postalcode').val(), $('#form-job')
										.val());
						sessionStorage.setItem("" + personToSave.id, JSON
								.stringify(personToSave));
						$(".article-block-listing").height(
								$(".article-block-listing").height() + 70);

						$('#create').fadeOut('slow', function() {
							fillListingPage();
							$('#listing').fadeIn('slow');
						});
					});

			$("section #listing")
					.on(
							"click",
							"a.modify-person-anchor",
							function(event) {
								var personJSON = sessionStorage
										.getItem(event.target.id);
								var personObject = JSON.parse(personJSON);
								idPersonToModify = event.target.id;
								$("#form-modify-firstname").val(
										personObject.firstName);
								$("#form-modify-lastname").val(
										personObject.lastName);
								$("#form-modify-email").val(personObject.email);
								$("#form-modify-phone").val(
										personObject.phoneNumber);
								$("#form-modify-city").val(personObject.city);
								$("#form-modify-postalcode").val(
										personObject.postalCode);
								$("#form-modify-job").val(personObject.job);
								$("#listing").fadeOut("slow", function() {
									$("#update").fadeIn("slow");
								});
							});

			$("section #listing").on("click", "span", function() {
				$("#form-firstname").val("");
				$("#form-lastname").val("");
				$("#form-email").val("");
				$("#form-phone").val("");
				$("#form-city").val("");
				$("#form-postalcode").val("");
				$("#form-job").val("");
				$("#listing").fadeOut("slow", function() {
					$("#create").fadeIn("slow");
				});
			});

			$("form.form-update").on('submit',
					function() {
						var personToSave = new person(idPersonToModify, $(
								'#form-modify-firstname').val(), $(
								'#form-modify-lastname').val(), $(
								'#form-modify-email').val(), $(
								'#form-modify-phone').val(), $(
								'#form-modify-city').val(), $(
								'#form-modify-postalcode').val(), $(
								'#form-modify-job').val());
						sessionStorage.setItem("" + personToSave.id, JSON
								.stringify(personToSave));
						$("#update").fadeOut("slow", function() {
							fillListingPage();
							$("#listing").fadeIn("slow");
						});
					});

			function displayPerson() {
				$('div.header-top a').trigger('customEvent', 'test');
			}
			var place = "main";
			var currentPlace = "presentation";
			$('form').submit(function(event){

				  event.preventDefault();

			});
			// END NAVIGATION
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
		};
	};
	return navigation;
});
