const http = require('http');
const conf = require('./config1/defaultConfig.js');
const chalk =require('chalk');
const path = require('path');
const fs = require('fs');


const server = http.createServer((req,res)=>{
	const url = req.url;
	const root1 = conf.root;
	const filePath = path.join(root1,url);
	fs.stat(filePath,(error,stats)=>{
       if (err) {
       	res.statusCode=404;
       	res.setHeader('Content-Type','text/plain');
       	res.end('404 not found');
       }
	})
	res.statusCode= 200;
	res.setHeader('Content-Type','text/html');
	res.write('<html>');
	res.write('<body>');
	res.write('<b>');
	res.write('hello,https!!!!!!!!!!!!!!!!');
	res.write('</b>');
	res.write('</br>';
	res.write(filePath);
	res.write('</body>');
	res.end('</html>');
});

server.listen(conf.port,conf.hostname,()=>{ 
	const addr= 'http://'+conf.hostname+':'+conf.port;
	console.log('server is running at '+chalk.green(addr));

}  );
