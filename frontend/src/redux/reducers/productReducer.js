import { 
  FETCH_PRODUCTS_SUCCESS,
  FETCH_PRODUCTS_FAIL,
  FETCH_PRODUCTS_REQUEST,
  SEARCH_PRODUCTS_REQUEST,
  SEARCH_PRODUCTS_SUCCESS,
  SEARCH_PRODUCTS_FAIL,
  SEARCH_PRODUCTS_RESET } from '../constants/productConstants'

const initState = {
  products: []
};

export const productReducer = (state = initState, action) => {
  switch (action.type) {
    case FETCH_PRODUCTS_REQUEST:
      return { loading: false, ...state };
    case FETCH_PRODUCTS_SUCCESS:
      return {
        ...state,
        products: action.payload
      };
  }

  return state;
};

export const productSearch = (state = {}, action) => {
  switch (action.type) {
    case SEARCH_PRODUCTS_REQUEST:
      return { loading: true };
    case SEARCH_PRODUCTS_SUCCESS:
      return { loading: false, products: action.payload };

    case SEARCH_PRODUCTS_FAIL:
      return { loading: false, error: action.payload };
    case SEARCH_PRODUCTS_RESET:
      return {};

    default:
      return state;
  }
};
