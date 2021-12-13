const hubspotService = require('./hubspot.service');
const axios = require('axios');

test('Filter function', async() => {
    // Arrange
    jest.mock('axios');
    axios.post = jest.fn(async () => {
        return {
          data:[
            {
            results: {
              name: "Property 3"
              }
            }
          ]
        }
    )}
})

test("Filter func", async() => {
    //Arrange
    jest.mock('axios');
    axios.post = jest.fn(async ()=> {
        return{
            data: [
                results, {
                    name: "Property 3"
                }
            ]
        }
    })
});








  // Act
  try {
    const data = await hubspotService.fetchContacts();
    console.log('this is data', data);
    expect(data[0].name).toEqual('Property 3')
  }catch(err) {
    console.log(err)
  }