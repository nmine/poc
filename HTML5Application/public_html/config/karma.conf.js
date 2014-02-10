module.exports = function(config){
  config.set({
    basePath : '../',

    files : [
      'js/lib/angular.js',
      'js/lib/angular-*.js',
      'js/**/*.js',
      'test/unit/**/*.js'
    ],

    exclude : [
      'app/lib/angular-loader.js',
      'app/lib/*.min.js',
      'app/lib/angular-scenario.js'
    ],

    autoWatch : true,

    frameworks: ['jasmine'],

    browsers : ['Chrome'],

    plugins : [
            'karma-junit-reporter',
            'karma-chrome-launcher',
            'karma-firefox-launcher',
            'karma-script-launcher',
            'karma-jasmine'
            ],

    junitReporter : {
      outputFile: 'test_out/unit.xml',
      suite: 'unit'
    }
  });
};
