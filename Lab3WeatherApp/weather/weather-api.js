
const API_BASE_URL = "https://api.openweathermap.org/data/2.5/weather";
const API_KEY = "4c4dae7069b8e9a373b2d0e759bd7ff8";

class WeatherAPI{

  constructor(cityName){

    this.cityName = cityName;
    this.apiUrl = new URL(API_BASE_URL);    
  }

  invoke(){

    this.buildURL();

   return fetch(this.apiUrl.toString())
    .then( (response ) => {
      return response.json()
    } )
    .then(  (responseAsJSON) => {
      console.log(responseAsJSON)
      return responseAsJSON;
    })
    .catch( (error) => {
      console.log("Error invoking the API");
      console.log(error);
      return;
    })

  }

  async invoke2(){

    this.buildURL();

    let response = await fetch(this.apiUrl.toString());

    if (response.status == 200){

      let responseAsJSON = response.json();
      console.log(responseAsJSON);
      return responseAsJSON;

    }else{

      console.log("API Invocation Error");
      return "ERROR";

    }
  }


  buildURL(){

    this.apiUrl.searchParams.append("q", this.cityName);
    this.apiUrl.searchParams.append("appid", API_KEY);
    this.apiUrl.searchParams.append("units", "metric");

    console.log(`URL is ${this.apiUrl}`);
  }

}

export {WeatherAPI}