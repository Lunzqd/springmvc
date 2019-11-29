import React, {Component} from 'react';
import axios from 'axios';
import './App.css'

class App extends Component {
	render() {
		return (
				<div className="container-fluid" style={{marginTop: '20px'}}>
					<div className="row">
						<div className="col-xs-4 col-xs-offset-1">
							<div className="panel panel-default">
								<div className="panel-body">
									<table className="table table-bordered">
										<thead>
										<tr>
											<th>ID</th>
											<th>用户名</th>
											<th>操作</th>
										</tr>
										</thead>
										<tbody>
										{
											this.state.list.map(item => {
												return (
														<tr key={item.id}>
															<td>{item.id}</td>
															<td>{item.name}</td>
															<td>
																<button className="btn btn-primary" onClick={() => {
																	this.setState({id: item.id, name: item.name})
																}}>修改
																</button>
																<button className="btn btn-danger" style={{marginLeft: '5px'}}
																        onClick={() => {
																	        this.deleteItem(item)
																        }}>删除
																</button>
															</td>
														</tr>
												)
											})
										}
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<div className="col-xs-3 col-xs-offset-1">
							<div className="panel panel-default">
								<div className="panel-body">
									<form className="form-horizontal">
										<div className="form-group">
											<label htmlFor="name" className="col-xs-3">用户名</label>
											<div className="col-xs-8">
												<input type="text" id="name" className="form-control" value={this.state.name} onChange={
													(e) => {
														this.setState({
															name: e.target.value
														})
													}
												}/>
											</div>
										</div>
										<div className="form-group">
											<div className="col-sm-offset-2 col-sm-10">
												<button className="btn btn-default" onClick={this.handleFormSubmit}>提交</button>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
		);
	}

	constructor(props) {
		super(props);
		this.state = {
			id: '',
			name: '',
			list: []
		}
	}

	componentDidMount() {
		this.query();
	}


	query = () => {
		axios.get('/user/all').then(({data}) => {
			this.setState({
				list: data
			});
		});
	};

	handleFormSubmit = (e) => {
		e.preventDefault();
		if (this.state.name !== '') {
			axios.post('/user/save', {
				id: !this.state.id ? '' : this.state.id,
				name: this.state.name
			}).then(({data}) => {
				this.setState({
					id: '',
					name: ''
				});
				this.query();
			})
		}
	};

	deleteItem = (item) => {
		axios.delete(`/user/${item.id}`).then(({data}) => {
			this.query();
		})
	};
}

export default App;
